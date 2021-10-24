package com.example.gieoquemaihoa;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Util {

    public static String getCurrentTimezoneOffset() {

        TimeZone tz = TimeZone.getDefault();
        Calendar cal = GregorianCalendar.getInstance(tz);
        int offsetInMillis = tz.getOffset(cal.getTimeInMillis());

        String offset = String.format("%02d.%02d", Math.abs(offsetInMillis / 3600000), Math.abs((offsetInMillis / 60000) % 60));
        //TODO: de - la bi sat mat 1 ngay
        offset = (offsetInMillis >= 0 ? "+" : "+") + offset;

        return offset;
    }

    public static BatQuai getBatQuaiTienThien(int iQuai) {
        switch (iQuai) {
            case 1:
                return new QueCan();
            case 2:
                return new QueDoai();
            case 3:
                return new QueLy();
            case 4:
                return new QueChan();
            case 5:
                return new QueTon();
            case 6:
                return new QueKham();
            case 7:
                return new QueCaan();
            case 8:
                return new QueKhon();

        }
        return null;
    }

}
