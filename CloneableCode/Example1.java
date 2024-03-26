package CloneableCode;

public class Example1 implements Cloneable {
    int i = 10;
    int j = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        Example1 ex = new Example1();

        Example1 ex1 = (Example1)ex.clone();
        ex1.i = 111;
        ex1.j = 222;
        System.out.println(ex.i + "====>" + ex.j);
        System.out.println(ex1.i + "====>" + ex1.j);
    }

}
