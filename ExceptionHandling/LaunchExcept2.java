package ExceptionHandling;

import java.sql.SQLOutput;
import java.util.Scanner;

class Alpha{
    public  void division(){
        System.out.println("Welcome to Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number to divide ");
        int a = sc.nextInt();

        System.out.println("Enter the Second number to divide");
        int b = sc.nextInt();

        int res = a/b;
        System.out.println("The res is " + res);
        System.out.println("Thank you ");
    }
}
class Beta {
    public void display() {
        Alpha a = new Alpha();
        a.division();
    }
}
public class LaunchExcept2 {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.display();
    }
}
