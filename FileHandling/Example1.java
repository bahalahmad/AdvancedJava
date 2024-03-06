package FileHandling;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        File f = new File("HeyJava.txt");
        System.out.println(f.exists());

        f.createNewFile();

        System.out.println(f.exists());

//first time when it will be run the output will be false and true
//second time when you will run it will show true

        //if you want to create a directory

        File f1 = new File("tempdir");
        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());


        // creating a file inside the directory
        File f2 = new File("tempdir","Temp.txt");
        System.out.println(f2.exists());
        f2.createNewFile();
        System.out.println(f2.exists());



    }
}


// windows -> file,folder(Directory) there is a difference
// Unix -> File,folder there is a no difference


