package MultiThread;

// creating thread by just one run method
class Alpha extends Thread{

    public void run(){
        String t = Thread.currentThread().getName();

        if(t.equals("BANK"))
            banking();
        else if(t.equals("PRINT"))
            printing();
        else
            calculating();
    }

    public void banking(){
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
    public void  calculating(){
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
    public void printing(){
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
public class LaunchGMT4 {
    public static void main(String[] args) throws Exception {
        Alpha a1 = new Alpha();
        Alpha a2  = new Alpha();
        Alpha a3 = new Alpha();

        a1.setName("BANK");
        a2.setName("PRINT");
        a3.setName("CALC");

        a1.start();
        a2.start();
        a3.start();
    }
}

