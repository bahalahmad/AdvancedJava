package Annotations;

class Demo{
    void getInfo(){
        System.out.println("Information in parent");
    }
}
class Demo1 extends Demo{
//    @Override
//    void getInform{
//        System.out.println("Override Succesfully");
//    }
    // by mistake while overriding if you type the method name incorrectly and if you will use annotations
    // it will give you compile time error ,so when different developers write code it is useful to use annotations


    @Override
    void getInfo() {
        System.out.println("Overriding successfully");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Demo d1 = new Demo1();
        d1.getInfo();
    }
}
