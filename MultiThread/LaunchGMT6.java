package MultiThread;

// use of synchronized keyword
class Bathroom implements Runnable{
    synchronized  public void run(){

        try {
            System.out.println(Thread.currentThread().getName()+ " has entered the bathroom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+ " is using the bathroom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" exited the bathroom");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class LaunchGMT6 {
    public static void main(String[] args) {

        Bathroom b = new Bathroom();

        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("GAY");

        t1.start();
        t2.start();
        t3.start();
    }
}
