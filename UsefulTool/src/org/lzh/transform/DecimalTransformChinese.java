package org.lzh.transform;

import java.math.BigDecimal;

public class DecimalTransformChinese{

    static String[] temp1 = new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    static String[] temp2 = new String[]{"万","仟","佰","拾"};
    public static String transform(double number){
        double v = keepThree(number);
        System.out.println(v);
        String[] slice = transformSlice(v);
        return transformJoin(slice);
    }

    //四舍五入保留三位小数
    private static double keepThree(double number){
        return new BigDecimal(number).setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    //分割字符串
    private static String[] transformSlice(double number) {
        return String.valueOf(number).split("\\.");
    }
    //转换组合
    private static String transformJoin(String[] parts){
        char[] chars1 = parts[0].toCharArray();
        char[] chars2 = parts[1].toCharArray();
        System.out.println(parts[0]);
        System.out.println(chars1[0]);
        if(chars1.length > 12){
            return "数值过大";
        }
        for (int i = chars1.length-1; i > 0; i--) {

        }
        return "ok";
    }
    public static void main(String[] args) {

        System.out.println(DecimalTransformChinese.transform(114565.1464));
    }
}
