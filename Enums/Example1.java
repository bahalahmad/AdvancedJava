package Enums;

enum RESULT{
    PASS,FAIL,NR;    //by default it is final and public and static
        }
public class Example1 {
    public static void main(String[] args) {

        // we can also create enum inside the class
        enum GENDER{
            MALE , FEMALE , OTHERS;
        }
        RESULT r  = RESULT.PASS;
        System.out.println(r);

        GENDER g = GENDER.FEMALE;
        System.out.println(g);

        int index = GENDER.FEMALE.ordinal();
        System.out.println(index);
    }
}
