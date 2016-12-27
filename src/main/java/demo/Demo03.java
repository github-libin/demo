package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by libin on 2016/12/18.
 */
public class Demo03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> class1 = Class.forName("demo.Student");
        System.out.println(class1);


        Student student = null;
        Class class2 = Class.forName("demo.Student");

        Method[] methods = class2.getMethods();
        for (Method method : methods) {
            System.out.println(method.toString());
        }
        System.out.println("65469470");


        Map map = new HashMap();

        List list = new ArrayList();

        Set set = new HashSet();

        System.out.println(test1());
        System.out.println(test2());

    }

    public static String test1() {

        try {
            System.out.println("test-try");
            return "test-try";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("test1-finally");
        }
        return null;
    }


    public static String test2() {
        for (String s :
                new String[]{"1", "2"}) {
            System.out.println(s);
        }
        return null;
    }


}

