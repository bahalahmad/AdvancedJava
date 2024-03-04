package MultiThread;

class Practice implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                String h = Thread.currentThread().getName();
                System.out.println(h + "entered Bathroom");
                Thread.sleep(2000);
            }
            synchronized (this){
                for(int i=0;i<3;i++){
                    String h = Thread.currentThread().getName();
                    System.out.println(h + " is using Bathroom");
                    Thread.sleep(2000);
                    System.out.println(h + "exited the Bathroom");
                }
            }
            for(int i =0;i<3;i++){
                String h = Thread.currentThread().getName();
                System.out.println(h + "boom");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class PracticeGMT {
    public static void main(String[] args) {
        Practice p = new Practice();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);

        t1.setName("boy");
        t2.setName("girl");
        t3.setName("tiktok");

        t1.start();
        System.out.println("Hi I am inside the program ");

        t2.start();
        t3.start();

        System.out.println("Hi I am main program");
    }
}
