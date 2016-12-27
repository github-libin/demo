package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by libin on 2016/12/25.
 *
 * @Autor libin
 */
public class Demo05 {

    private static Vector<String> vector = new Vector<String>();
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
//        System.out.println(Integer.bitCount(1 ^ 6));

        System.out.println(format.format(new Date()));
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");

        for (String string : vector) {
            System.out.println(string);
        }

        System.out.println("-------");
        System.out.println("5555");
        int index = vector.size() - 1;
        System.out.println(vector.remove(index));
    }
}
