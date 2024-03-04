package MultiThread;

// use of join method()
class Join1 implements Runnable{

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

class Join2 implements Runnable {
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

class Join3 implements Runnable {
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
//main thread will get the chance first and main thread is the one who is completing the work first
public class LaunchGMT5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread got the chance first ");
        Join1 d1 =new Join1();
        Join2 d2 =new Join2();
        Join3 d3 =new Join3();



        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println("Main Thread is completing the work first ");
    }
}
// maybe there is a requirement that you want main thread or any other thread to wait unless or until other thread joins you
//
