package ComptvCompb;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); //-ve value if obj1 has to come before obj2
        System.out.println("Z".compareTo("A")); // +ve value if obj1 has to come after obj2
        System.out.println("A".compareTo("A")); // 0 if both are equal to
        //System.out.println("Z".compareTo(null)); //NPE
    }
}
