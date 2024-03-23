package Serialization_Deserialization;

import java.io.*;

class Account implements Serializable {
    String name= "Sachin";
    transient String password = "tendulkar";

    private void writeObject(ObjectOutputStream oos) throws Exception{
        oos.defaultWriteObject(); // all the properties will be written

        String epwd = 123 + password;
        oos.writeObject(epwd);

    }

    private  void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject(); // all the properties will be written

        String epwd = (String)ois.readObject();

        //enpwd  = "123tendulkar";

        password = epwd.substring(2);
    }
}

//at the time of account object serialization JVM will check is there any writeObject() method in account class or not
//if it is not available then JVM is responsible to perform serialization(default serialization)
// if account class contains writeObject() method then JVM feels very happy and executes that Account class writeObject() method




public class Example4{
    public  static void main(String[] args) throws IOException, ClassNotFoundException {
        Account acc = new Account();
        System.out.println(acc.name + "====>" + acc.password);

        System.out.println("Serialization started");
        FileOutputStream fos = new FileOutputStream("abc3.ser");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(acc);
        System.out.println("Serialization Ended");

        System.out.println("_____________________");

        System.out.println("DeSerialization Started");

        FileInputStream fis = new FileInputStream("abc3.ser");

        ObjectInputStream ois = new ObjectInputStream(fis);

       Account acc1 =  (Account)ois.readObject();

        System.out.println(acc1.password);

        System.out.println("Deserialization ended ");
    }
}
//password will not be transferred to the network as it is transient