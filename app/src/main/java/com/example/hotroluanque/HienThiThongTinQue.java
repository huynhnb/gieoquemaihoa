package com.example.hotroluanque;

import android.content.Context;
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
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class HienThiThongTinQue extends Fragment {

    private static final HashMap<String, String> haotoTenQue = new HashMap<>();
    static {
        haotoTenQue.put("Thuần Càn", "111111");
        haotoTenQue.put("Thuần Khôn", "000000");
        haotoTenQue.put("Thiên Phong Cấu","011111");
        haotoTenQue.put("Thiên Sơn Độn","001111");
        haotoTenQue.put("Thiên Địa Bỉ","000111");
        haotoTenQue.put("Phong Địa Quan","000011");
        haotoTenQue.put("Sơn Địa Bác","000001");
        haotoTenQue.put("Hỏa Địa Tấn","000101");
        haotoTenQue.put("Hỏa Thiên Đại Hữu","111101");
        haotoTenQue.put("Thuần Đoài","110110");
        haotoTenQue.put("Trạch Thủy Khốn","010110");
        haotoTenQue.put("Trạch Địa Tụy","000110");
        haotoTenQue.put("Trạch Sơn Hàm","001110");
        haotoTenQue.put("Thủy Sơn Kiển","001010");
        haotoTenQue.put("Địa Sơn Khiêm","001000");
        haotoTenQue.put("Lôi Sơn Tiểu Quá","001100");
        haotoTenQue.put("Lôi Trạch Quy Muội","110100");
        haotoTenQue.put("Thuần Ly","101101");
        haotoTenQue.put("Hỏa Sơn Lữ","001101");
        haotoTenQue.put("Hỏa Phong Đỉnh","011101");
        haotoTenQue.put("Hỏa Thủy Vị Tế","010101");
        haotoTenQue.put("Sơn Thủy Mông","010001");
        haotoTenQue.put("Phong Thủy Hoán","010011");
        haotoTenQue.put("Thiên Thủy Tụng","010111");
        haotoTenQue.put("Thiên Hỏa Đồng Nhân","101111");
        haotoTenQue.put("Thuần Chấn","100100");
        haotoTenQue.put("Lôi Địa Dự","000100");
        haotoTenQue.put("Lôi Thủy Giải","010100");
        haotoTenQue.put("Lôi Phong Hằng","011100");
        haotoTenQue.put("Địa Phong Thăng","011000");
        haotoTenQue.put("Thủy Phong Tỉnh","011010");
        haotoTenQue.put("Trạch Phong Đại Quá","011110");
        haotoTenQue.put("Trạch Lôi Tùy","100110");
        haotoTenQue.put("Thuần Tốn","011011");
        haotoTenQue.put("Phong Thiên Tiểu Súc","111011");
        haotoTenQue.put("Phong Hỏa Gia Nhân","101011");
        haotoTenQue.put("Phong Lôi Ích","100011");
        haotoTenQue.put("Thiên Lôi Vô Vọng","100111");
        haotoTenQue.put("Hỏa Lội Phệ Hạp","100101");
        haotoTenQue.put("Sơn Lôi Di","100001");
        haotoTenQue.put("Sơn Phong Cổ","011001");
        haotoTenQue.put("Thuần Khảm","010010");
        haotoTenQue.put("Thủy Trạch Tiết","110010");
        haotoTenQue.put("Thủy Lôi Truân","100010");
        haotoTenQue.put("Thủy Hỏa Ký Tế","101010");
        haotoTenQue.put("Trạch Hỏa Cách","101110");
        haotoTenQue.put("Lôi Hỏa Phong","101100");
        haotoTenQue.put("Địa Hỏa Minh Di","101000");
        haotoTenQue.put("Địa Thủy Sư","010000");
        haotoTenQue.put("Thuần Cấn","001001");
        haotoTenQue.put("Sơn Hỏa Bí","101001");
        haotoTenQue.put("Sơn Thiên Đại Súc","111001");
        haotoTenQue.put("Sơn Trạch Tổn","110001");
        haotoTenQue.put("Hỏa Trạch Khê","110101");
        haotoTenQue.put("Thiên Trạch Lý","110111");
        haotoTenQue.put("Phong Trạch Trung Phu","110011");
        haotoTenQue.put("Phong Sơn Tiệm","001011");
        haotoTenQue.put("Địa Lôi Phục","100000");
        haotoTenQue.put("Địa Trạch Lâm","110000");
        haotoTenQue.put("Địa Thiên Thái","111000");
        haotoTenQue.put("Lôi Thiên Đại Tráng","111100");
        haotoTenQue.put("Trạch Thiên Quải","111110");
        haotoTenQue.put("Thủy Thiên Nhu","111010");
        haotoTenQue.put("Thủy Địa Tỷ","000010");
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
        String queSelected = "Thuần Càn";
        int hao_bien = 1;
        Spinner queSelectedSp = (Spinner) view.getRootView().findViewById(R.id.spinner);

        Spinner haobienSelectedSp = (Spinner) view.getRootView().findViewById(R.id.spinner2);

        if (queSelectedSp != null) {
            queSelected = queSelectedSp.getSelectedItem().toString();
            System.out.println(queSelected);
        }

        if (haobienSelectedSp != null) {
            hao_bien = 1 + haobienSelectedSp.getSelectedItemPosition();
            System.out.println(hao_bien);
        }

        // display value
        String maquechinh = haotoTenQue.get(queSelected);

        QueKinhDich queChinh = new QueKinhDich(maquechinh, hao_bien);

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
