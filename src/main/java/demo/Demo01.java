package demo;

/**
 * Created by libin on 2016/12/4.
 */
public class Demo01 {
    static int x = 0, y = 0;
    static int a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<100;i++){
            Thread one = new Thread(new Runnable() {
                public void run() {
                    a = 1;
                    x = b;
                }
            });

            Thread other = new Thread(new Runnable() {
                public void run() {
                    b = 1;
                    y = a;
                }
            });
            one.start();other.start();
            one.join();other.join();
            System.out.println("(" + x + "," + y + ")");
        }

    }
}
