package MultiThread;

class Producer extends Thread{

    StringBuffer sb;  // producer producing the data in stringbuffer

    boolean dataProvider = false; //variable used by thread for communication

    public Producer(){
        //string buffer object is created with the default capacity 16
         sb = new StringBuffer();
    }
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                sb.append(i + " ");
                Thread.sleep(100);
                System.out.println("Appending");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //informing the consumer that data is provided
        dataProvider = true;
    }
}
class Consumer extends Thread{
    //creating producer object to get the produced data from StringBuffer
    Producer producer;

    //injecting the producer object into consumer
    public Consumer(Producer producer){
        this.producer = producer;
    }
    public void run(){

        //check for the producer data provider for the data provider variable
        // if true only consume the data otherwise enter into sleeping state
        while(producer.dataProvider == false){
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //consume the data produced by the producer
        System.out.println(producer.sb);
    }
}

//Inefficient way of InterThread communication
public class Communication {
    public static void main(String[] args) {
        Producer obj1  = new Producer();
        Consumer obj2 = new Consumer(obj1);

        Thread t1 = new Thread(obj1); // producer Thread
        Thread t2 = new Thread(obj2); //consumer Thread

        t2.start(); // consumer should wait
        t1.start();  // producer should start
    }
}
