package Enums;

enum Gender{
    MALE,FEMALE,OTHERS;

    //final static Gender MALE  = new Gender(); thats how object is created
}
public class Example3 {
    public static void main(String[] args) {
        Gender g = Gender.MALE;
        System.out.println(g);

        Gender[] gr = Gender.FEMALE.values();
        for(Gender gg : gr){
            System.out.println(gg + " " + gg.ordinal());
        }
    }
}
