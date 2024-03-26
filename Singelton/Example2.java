package Singelton;

class  Demo {
    private static Demo d = null;

    private Demo() {

    }//to avoid object creation by the user using new keyword

    public static Demo getDemo() {
        if (d == null)
             d = new Demo();
            return d;
    }
}

public class Example2 {
    public static void main(String[] args) {
        //static factory methods
            Demo d1 = Demo.getDemo();
            Demo d2 = Demo.getDemo();

            System.out.println(d1.hashCode());
            System.out.println(d2.hashCode());
            System.out.println(d1==d2);
    }
}
//if i allow constructor to be called we can't make it as singleton
// so make constructor as private