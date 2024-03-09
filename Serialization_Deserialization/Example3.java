package Serialization_Deserialization;

import java.io.*;

class Tiger implements Serializable {
   transient int i = 10;
   /// due to some security reason if you don't want some value to participate in
    //serialization then use transient keyword
    int j = 20;

    //static transient int j = 20;
    //when you will make this variable as static transient it will never participate in serialization

    //transient final int j = 20;
    // there will be no impact in static and final transient


    Tiger(){
        System.out.println("Tiger constructor called ");
    }
}

public class Example3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Tiger t = new Tiger();
        System.out.println("Serialization started ");

        FileOutputStream fos = new FileOutputStream("abc2.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(t);

        System.out.println("Serialization ended ");



        System.out.println("DeSerialization started ");

        FileInputStream fis = new FileInputStream("abc2.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Tiger tt =  (Tiger) ois.readObject();

        System.out.println("DeSerialization ended ");

        System.out.println(tt.i);
        System.out.println(tt.j);
    }
}
