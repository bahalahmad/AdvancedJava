package FileHandling;

import java.io.File;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args)  throws IOException {

        //create a file named with demo.txt with current working directory
        File f = new File("demo.txt");
        f.createNewFile();

        //create a directory named with IPL team in current working directory and create a file name with abc.txt

        File f1 = new File("IPLeam");
        f1.mkdir();

        File f2 = new File("IPLeam","abc.txt");
        f2.createNewFile();


        //create a file named with rcb.txt present in G:\IPLTeam folder
        File f3 = new File("G:\\IPLTeam","rcb.txt");
        f3.createNewFile();




    }


}
