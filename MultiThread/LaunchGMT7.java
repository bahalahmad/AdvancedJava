package MultiThread;
// use of synchronized in block
class iNeuron implements  Runnable{
     public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(i);
            }
            Thread.sleep(3000);
            synchronized (this){
                for (int i = 0; i < 5; i++) {
                    System.out.println((char) i + 65);
                }
}
        }
        catch(Exception e){
            System.out.println("Some interruptions");
        }
    }
}
public class LaunchGMT7 {
    public static void main(String[] args) {
        iNeuron i1 = new iNeuron();

        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i1);
        Thread t3 = new Thread(i1);

        t1.start();
        t2.start();
        t3.start();
    }
}
