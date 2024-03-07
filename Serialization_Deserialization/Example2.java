package Serialization_Deserialization;

import java.io.*;

class Cow implements Serializable{
    int i = 10;
    int j = 20;

    Cow(){
        System.out.println("Cow constructor called ");
    }
}

class Cat implements  Serializable{
    int i=30;
    int j=40;

    Cat(){
        System.out.println("Cat constructor called ");
    }
}

public class Example2 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{

        Cow c = new Cow();
        Cat t = new Cat();
        System.out.println("Serialization started ");

        FileOutputStream fos = new FileOutputStream("abc1.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c);
        oos.writeObject(t);


        System.out.println("Serialization ended ");



        System.out.println("DeSerialization started ");

        FileInputStream fis = new FileInputStream("abc1.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Cow cc =  (Cow) ois.readObject();
        Cat tt =  (Cat) ois.readObject();


        System.out.println("DeSerialization ended ");

        System.out.println(cc.i + "------------" + cc.j);
        System.out.println(tt.i + "-------------" + tt.j);
    }
}

//Cow constructor called
//Cat constructor called
//Serialization started
//Serialization ended
//DeSerialization started
//DeSerialization ended
//10------------20
//30-------------40