package ExceptionHandling;

//public class LaunchExcept1 {
//    public static void main(String[] args) {
//        System.out.println("Array is getting created");
//        int[] arr = new int[999999999];
//    }
//}
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

class Demo1{
    public void display(){
        display();
    }
}
public  class LaunchExcept1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        System.out.println("Method is getting called");
        d1.display();
    }
}
//Method is getting called
//Exception in thread "main" java.lang.StackOverflowError


// Abnormal termination of program during runtime
