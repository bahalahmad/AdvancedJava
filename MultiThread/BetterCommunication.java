package MultiThread;

class BetterProducer extends Thread {
    StringBuffer sb;  // producer producing the data in stringbuffer

    public BetterProducer() {
        //string buffer object is created with the default capacity 16
        sb = new StringBuffer();
    }

    public void run() {
        synchronized (sb) {
            for (int i = 1; i <= 10; i++) {
                try {
                    sb.append(i + " ");
                    Thread.sleep(100);
                    System.out.println("Appending");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //send the notification to waiting thread
            sb.notify();
        }
    }
}

class BetterConsumer extends Thread{
    //creating producer object to get the produced data from StringBuffer
    BetterProducer producer;

    //injecting the producer object into consumer
    public BetterConsumer(BetterProducer producer){
        this.producer = producer;
    }

    public void run() {
        synchronized (producer.sb) {
            try {
                // wait till the notification is sent by producer
                producer.sb.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(producer.sb);
        }
    }
}
//Efficient way of InterThread communication using wait() and notify()
public class BetterCommunication {
    public static void main(String[] args) {
        BetterProducer obj1  = new BetterProducer();
        BetterConsumer obj2 = new BetterConsumer(obj1);

        Thread t1 = new Thread(obj1); // producer Thread
        Thread t2 = new Thread(obj2); //consumer Thread

        t2.start(); // consumer should wait
        t1.start();  // producer should start
    }
}
