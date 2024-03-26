package SerialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import SerialVersionUID.Student;

public class Sender {
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos =  new ObjectOutputStream(fos);
        oos.writeObject(s);
    }
}
