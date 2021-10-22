package org.lzh.transform;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTransform {
    //格林威治时间 - > java.util.Date
    public static Date getDate(long greenwichMeanTime){
        //按需转换 Date -> String
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date(greenwichMeanTime));
        return new Date(greenwichMeanTime);
    }
}
