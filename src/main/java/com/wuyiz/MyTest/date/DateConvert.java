package com.wuyiz.MyTest.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期 <=> 时间戳
 */
public class DateConvert {
    public static void main(String[] args) {
        System.out.println(DateToStamp("2020-1-16 8:35:50"));
        System.out.println(StampToDate(1579134951000L));
    }

    public static Long DateToStamp(String dateStr) {
        Long time = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = sdf.parse(dateStr);
            time = date.getTime();
            return time;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public static String StampToDate(Long stamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(stamp);
        return date;
    }
}
