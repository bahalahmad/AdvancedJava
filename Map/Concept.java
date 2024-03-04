package Map;

public class Concept {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        ;;;;;;;
        ;;;;;;;
        ;;;;;;;

        e = null;

        System.gc(); //informing JVM  to active  GC  thread to clean  garbage object

        Thread.sleep(5000);
    }
}
class Employee {
    public void finalize(){
        System.out.println(" cleaning the object ");
    }
}
// even your object is null jvm will never call garbage collector to clean the object
// then what we will do is we will explicitly call with the help of system.gc