package MultiThread;

class Daem implements Runnable{
    public void run() {
        try{
            for(int i=0;i<4;i++){
                System.out.println("Java is best to understand for beginners ");
                Thread.sleep(3000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class LaunchGMT10 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t.isDaemon());
        //t.setDaemon(true);
        //System.out.println(t.isDaemon());

        // you cannot make main thread as daemon thread

        Daem i1  = new Daem();
        Thread t1  = new Thread(i1);
        System.out.println(t1.isDaemon());
        t1.start();
    }
}
