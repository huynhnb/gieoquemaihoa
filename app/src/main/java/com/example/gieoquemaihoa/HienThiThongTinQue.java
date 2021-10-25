package com.example.gieoquemaihoa;

import android.app.ActionBar;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class HienThiThongTinQue extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        DatePicker datePicker = (DatePicker) view.getRootView().findViewById(R.id.calendar);
        TimePicker timePicker = (TimePicker) view.getRootView().findViewById(R.id.timepicker);

        int intMonth = 1 + datePicker.getMonth();
        int intDay = datePicker.getDayOfMonth();
        int intYear = datePicker.getYear();

        Integer intHour = timePicker.getCurrentHour();
        Integer intMin = timePicker.getCurrentMinute();

        Double offset_timezone =Double.valueOf(Util.getCurrentTimezoneOffset());

        Year year = new Year();
        year.setNumDuongLich(intYear);
        year = ConvertDuongLichtoAmLich.ConvertDL2AL(year);
        int[] amlich = VietCalendar.convertSolar2Lunar(intDay, intMonth, intYear,offset_timezone);

        int gio = ConvertDuongLichtoAmLich.convertGioDLtoAL(intHour, intMin);

        int totalHaoNgoai = year.getNumIn12Congiap() + amlich[0] + amlich[1];

        int totalHaoNoi = totalHaoNgoai + gio;

        int intQueThuong = 0;
        int intQueHa = 0;
        int haobien = 0;

        if (totalHaoNgoai % 8 == 0) {
            intQueThuong = 8;
        } else {
            intQueThuong = totalHaoNgoai % 8;
        }

        if (totalHaoNoi % 8 == 0) {
            intQueHa = 8;
        } else {
            intQueHa = totalHaoNoi % 8;
        }

        if (totalHaoNoi % 6 == 0) {
            haobien = 6;
        } else {
            haobien = totalHaoNoi % 6;
        }

        BatQuai noiquai = Util.getBatQuaiTienThien(intQueThuong);
        BatQuai ngoaiquai = Util.getBatQuaiTienThien(intQueHa);

        int[] haoDong = new int[7];
        haoDong[haobien] = 1;
        //getActivity().setTitle("Gieo Quẻ Mai Hoa - Hào Biến "+haobien);
        getActivity().setTitle(Html.fromHtml("<small>Hào Biến "+haobien+" - Luận Quẻ</small>"));

        QueKinhDich queChinh = new QueKinhDich();
        queChinh.setHao1(ngoaiquai.hao3.getValue());
        queChinh.setHao2(ngoaiquai.hao2.getValue());
        queChinh.setHao3(ngoaiquai.hao1.getValue());
        queChinh.setHao4(noiquai.hao3.getValue());
        queChinh.setHao5(noiquai.hao2.getValue());
        queChinh.setHao6(noiquai.hao1.getValue());
        queChinh.setHao_bien(haoDong);

        QueKinhDich queHo = queChinh.getQueHo();
        QueKinhDich queBien = queChinh.getQueBien();

        try {
            String qc = ReadLineByLineJava8(queChinh.getTenQue());
            String qh = ReadLineByLineJava8(queHo.getTenQue());
            String qb = ReadLineByLineJava8(queBien.getTenQue());



            TextView qcTv = (TextView) view.getRootView().findViewById(R.id.qc);
            qcTv.setText(qc);

            TextView qhTv = (TextView) view.getRootView().findViewById(R.id.qh);
            qhTv.setText(qh);

            TextView qbTv = (TextView) view.getRootView().findViewById(R.id.qb);
            qbTv.setText(qb);



        } catch (IOException e) {
            e.printStackTrace();
        }


        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HienThiThongTinQue.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public String ReadLineByLineJava8(String filePath) throws IOException {
        AssetManager as = getResources().getAssets();
        InputStream is = as.open(filePath);
        StringBuffer buf = new StringBuffer();
        String str = "";

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            if (is != null) {
                while ((str = reader.readLine()) != null) {
                    buf.append(str + "\n" );
                }
            }
        } finally {
            try { is.close(); } catch (Throwable ignore) {}
        }

        return buf.toString();
    }
}
