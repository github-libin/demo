package demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by libin on 2016/12/27.
 *
 * @Autor libin
 */
public class TestList {

    private static LinkedList<Integer> linkedList = new LinkedList<Integer>();
    private static ArrayList<Integer> arrayList  = new ArrayList<Integer>();




    public static void main(String[] args) {

//        for(int i =0;i<100;i++){
//            linkedList.add(i+1);
//            arrayList.add(i+1);
//        }
//
//        long start1 = System.currentTimeMillis();
//        linkedList.add(999);
//        System.out.println("linkedList insert const " + (System.currentTimeMillis()-start1)+"ms");
//
//        long start2 = System.currentTimeMillis();
//        arrayList.add(999);
//        System.out.println("arrayList insert const "+ (System.currentTimeMillis()-start2)+"ms");


        long time3 = new Date().getTime();
        for(int m=0;m<20000;m++){
            linkedList.add(m,null);      //当在200000条数据之前插入20000条数据时，LinkedList只用了1125多ms.这就是LinkedList的优势所在
        }
        long time4 = new Date().getTime();
        System.out.print("batch linkedlist add:");
        System.out.println(time4 - time3);
        for(int n=0;n<20000;n++){
            arrayList.add(n, null);  //当在200000条数据之前插入20000条数据时，ArrayList用了18375多ms.时间花费是arraylist的近20倍(视测试时机器性能)
        }
        long time5 = new Date().getTime();
        System.out.print("batch arraylist add:");
        System.out.println(time5 - time4);


        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
