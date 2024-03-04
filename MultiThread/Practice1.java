package MultiThread;

//class Demo extends  Thread{
//    int total = 0;
//    public void run(){
//        for(int i=0;i<=100;i++){
//            total = total+i;
//        }
//    }
//}
//public class Practice1 {
//    public static void main(String[] args) throws Exception {
//        Demo d = new Demo();
//        d.start();
//        Thread.sleep(2000);
//        System.out.println(d.total);
//    }
//}

class Demo extends Thread{
    int total = 0;
    public void run(){
        // producer
        synchronized (this){
            System.out.println("Child Thread Starts the Execution"); //step-2
            for(int i=1;i<100;i++){
                total+= i;
            }
            System.out.println("Child Thread is Giving the notification call "); //step-3
            this.notify();
        }
    }
}
public class Practice1{
    public static void main(String[] args) throws Exception {
        Demo d = new Demo();
        d.start();
        // Consumer Thread (Producer- Consumer )
        synchronized (d){
            System.out.println("Main Thread is calling wait() method"); //step-1
            d.wait();
            System.out.println("Main Thread got the notification call");
            System.out.println(d.total);
        }
    }
}


