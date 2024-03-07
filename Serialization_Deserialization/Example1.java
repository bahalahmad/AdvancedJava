package Serialization_Deserialization;

import java.io.*;

class Dog implements  Serializable{
    int i=10;
    int j = 20;

    Dog(){
        System.out.println("Dog constructor called ");
    }
}
public class Example1 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //doing serialization
        Dog d = new Dog();
        System.out.println("Serialization started ");

        FileOutputStream fos = new FileOutputStream("abc.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(d);

        System.out.println("Serialization ended ");



        System.out.println("DeSerialization started ");

        FileInputStream fis = new FileInputStream("abc.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog dd =  (Dog) ois.readObject();

        System.out.println("DeSerialization ended ");

        System.out.println(dd.i);
        System.out.println(dd.j);


    }
}

