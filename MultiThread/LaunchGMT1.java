package MultiThread;

class Demo1 {
    public void banking() {
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

class Demo2 {
    public void calculating() {
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

class Demo3 {
    public void printing() {
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

public class LaunchGMT1 {
    public static void main(String[] args) throws Exception {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d1.banking();
        d2.calculating();
        d3.printing();
    }
}
