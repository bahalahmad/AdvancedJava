package Singelton;

public class Example1 {
    public static void main(String[] args) {

        //static factory methods and it is a singleton class(Runtime)
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();

        System.out.println(r1==r2); // true
    }
}
// runtime is an inbiult class