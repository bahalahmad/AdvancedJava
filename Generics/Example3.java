package Generics;


class Demo<T extends Number>{

}
//class Sample<T implements X>{
//
//        }  //this is invalid

//class Twist<T super X> // invalid
class Trial<T extends Runnable>{

}
public class Example3 {
    public static void main(String[] args) {
           // Demo<String> d1 =  new Demo<String>(); // invalid
            Demo<Double> d2 =  new Demo<Double>(); // valid
            Demo<Integer> d3 =  new Demo<Integer>(); //valid
            Demo<Number> d4 = new Demo<Number>(); // valid

            Trial<Runnable> t1 = new Trial<Runnable>(); //valid
            Trial<Thread> t2 = new Trial<Thread>(); //valid
            //Trial<String> t1 = new Trial<String>(); // invalid

    }
}
