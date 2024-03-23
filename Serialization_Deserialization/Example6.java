package Serialization_Deserialization;

import java.io.*;

class Demo implements Externalizable{
    String s;
    int i;
    int j;

    public Demo(String s,int i,int j){
        this.s = s;
        this.i = i;
        this.j = j;
    }
    public Demo(){
        System.out.println("Constructor called");
    }

    @Override
    //call back method
    // it is called callback object because you are calling writeObject but this method is getting called
    public void writeExternal(ObjectOutput out) throws IOException {
                out.writeObject(s);
                out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
                s = (String)in.readObject();
                i = in.readInt();
    }

}
public class Example6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Demo d = new Demo("sachin",10,100);
        System.out.println("Serialization Started");
        FileOutputStream fos = new FileOutputStream("abc5.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);

        System.out.println("Serialization ended");

        System.out.println();

        System.out.println("Deserialization ended");
        FileInputStream fis = new FileInputStream("abc5.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Demo d1 = (Demo)ois.readObject();

        System.out.println("Deserialization ended");
        System.out.println(d1.i +"==>" + d1.j + "==>" + d1.s);

    }
}
