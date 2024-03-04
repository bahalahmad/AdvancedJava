// creating thread using extending Thread class
package MultiThread;
class Demo4 extends Thread{

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

class Demo5 extends Thread {
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

class Demo6 extends Thread {
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
public class LaunchGMT2 {
    public static void main(String[] args) throws Exception {
        Demo4 d1 = new Demo4();
        Demo5 d2 = new Demo5();
        Demo6 d3 = new Demo6();
        d1.start();
        d2.start();
        d3.start();
    }
}
