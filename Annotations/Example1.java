package Annotations;

//it is functional interface please don't add more method
//its scope is until compile time
// so we need something better approach so we use annotations
//when we will use annotations and add more than one method it will give me compile time error

@FunctionalInterface
interface Addition{
    void add();
   // int add(int a); we can't add more than one method it will give compile time error

}

public class Example1 {
    public static void main(String[] args) {
            //below code is adding two number
            int a=10;
            int b=20;
            System.out.println(a+b);
    }
}
//what ever information you are giving, it is just up-to compile time