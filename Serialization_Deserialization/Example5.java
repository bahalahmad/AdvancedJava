package Serialization_Deserialization;

import java.io.*;

class Vehicle implements Serializable{
    int i =10;
}
class Car extends Vehicle{
    int j = 20;
}
public class Example5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car c = new Car();

        System.out.println("Serialization started");

        FileOutputStream fos = new FileOutputStream("abc4.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c);

        System.out.println("Serialization ended");

        FileInputStream fis = new FileInputStream("abc4.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Car cc = (Car)ois.readObject();

        System.out.println("Deserialization ended");

        System.out.println(cc.i + "======>" + cc.j);






    }
}
