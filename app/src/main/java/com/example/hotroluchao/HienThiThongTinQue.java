package com.example.hotroluchao;

import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
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
    private static final HashMap<String, String> haoToMaAmDuong = new HashMap<>();
    static {
        haoToMaAmDuong.put("Dương", "1");
        haoToMaAmDuong.put("Âm", "0");
    }

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

        Spinner hao6 = (Spinner) view.getRootView().findViewById(R.id.hao6);
        Spinner hao5 = (Spinner) view.getRootView().findViewById(R.id.hao5);
        Spinner hao4 = (Spinner) view.getRootView().findViewById(R.id.hao4);
        Spinner hao3 = (Spinner) view.getRootView().findViewById(R.id.hao3);
        Spinner hao2 = (Spinner) view.getRootView().findViewById(R.id.hao2);
        Spinner hao1 = (Spinner) view.getRootView().findViewById(R.id.hao1);



        String strHao6 = hao6.getSelectedItem().toString();
        String strHao5 = hao5.getSelectedItem().toString();
        String strHao4 = hao4.getSelectedItem().toString();
        String strHao3 = hao3.getSelectedItem().toString();
        String strHao2 = hao2.getSelectedItem().toString();
        String strHao1 = hao1.getSelectedItem().toString();

        String maquechinh = haoToMaAmDuong.get(strHao1)+ haoToMaAmDuong.get(strHao2) + haoToMaAmDuong.get(strHao3)
                + haoToMaAmDuong.get(strHao4)+ haoToMaAmDuong.get(strHao5) + haoToMaAmDuong.get(strHao6);

        int[] haoDong = new int[7];



        QueKinhDich queChinh = new QueKinhDich(maquechinh, haoDong);

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
