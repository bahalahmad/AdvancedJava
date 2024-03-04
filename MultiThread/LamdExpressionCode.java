package MultiThread;

//class Test extends Thread{
//    public void run(){
//        for (int i=1;i<=5;i++){
//            try{
//                System.out.println("Child Thread");
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
// one more way we can create a Thread

//class Test implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i=1;i<=5;i++){
//            try{
//            System.out.println("Child Thread");
//                Thread.sleep(1000);
//            }
//            catch (InterruptedException e){
//                e.printStackTrace();
//          }
//       }
//    }
//}




public class LamdExpressionCode {
    public static void main(String[] args) {
//       Annonymous inner class coding new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 5; i++) {
//                    try {
//                        System.out.println("Child Thread");
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
        // lamda expression coding
        new Thread(
                ()->{
            for (int i=1;i<=5;i++){
                try {
                    System.out.println("Child Thread");
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
        for(int i=1;i<=10;i++){
            try {
                System.out.println("Main Thread");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

    // Thread t1 = new Thread(new Runnable() {
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            try {
//                System.out.println("Child Thread");
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//});
//T1.start();


//When we write new Runnable(),
//it's actually instantiating an anonymous inner class that implements the Runnable interface