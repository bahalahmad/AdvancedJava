package Enums;

enum Color{
    RED,BLUE,BLACK,PINK;

    Color(){
        System.out.println("Constructor is getting called as no of times object is created");
    }
}

public class Example4 {
    public static void main(String[] args) {
        Color r = Color.RED;
        //Color rr = new Color(); we cant create object on enum explicitly

        switch(r){
            case BLACK -> System.out.println("Color is Black");
            case BLUE -> System.out.println("Color is Blue");
            case RED -> System.out.println("Color is Red");
            case PINK -> System.out.println("Color is Pink");

            // we can also enums in switch
        }


    }
}
//internally color class is getting created
//parent class for particular class in Enum which is present inside java.lang package
//if there is a class you can create any no of object
// we cant create object of enum explicitly