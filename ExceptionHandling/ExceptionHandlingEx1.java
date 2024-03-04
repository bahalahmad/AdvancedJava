package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingEx1 {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome to division programming");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = s.nextInt();
            System.out.println("Enter the second number");
            int b = s.nextInt();
            int res = a / b;
            System.out.println("The result is " + res);
        }
        catch (Exception e) {
            System.out.println("Thank you for using out Application");
        }
    }
}
