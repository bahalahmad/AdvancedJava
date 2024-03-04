package MultiThread;

// creating thread by implementing runnable interface
class Demo11 implements Runnable{

    public void run(){
        System.out.println("Banking Task Started");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Banking............");
        }
        System.out.println("Banking Task Ended..........");

        System.out.println("-----------------------------");
    }

}

class Demo12 implements Runnable {
    public void run(){
        System.out.println("calculating Task Started");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Calculating............");
        }
        System.out.println("Calculating Task Ended..........");

        System.out.println("-----------------------------");
    }
}

class Demo13 implements Runnable {
    public void run(){
        System.out.println("Printing Task Started");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Printing............");
        }
        System.out.println("Printing Task Ended..........");

        System.out.println("-----------------------------");
    }
}
public class LaunchGMT3 {
    public static void main(String[] args) throws Exception {
        Demo11 d1 = new Demo11();
        Demo12 d2 = new Demo12();
        Demo13 d3 = new Demo13();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();
    }
}
