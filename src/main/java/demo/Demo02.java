package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by libin on 2016/12/4.
 */
public class Demo02 {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        String string  = new String("abc");
//        System.out.println(Integer.parseInt(string));


        float a1=20.3f;
        double a2 =20.3d;


//        BigDecimal b = new BigDecimal(String.valueOf(a1));
//        double d = b.doubleValue();
        System.out.println("运行时间："+format.format(new Date()));
        System.out.println(a1==a2);
//        System.out.println(b);


        System.out.println("111");
        System.out.println("222");
    }
}
