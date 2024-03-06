package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) throws IOException {
       // FileReader fr = new FileReader("info.txt");
//        int i = fr.read();
//        while(i!=-1){
//            System.out.print((char)i);
//            i = fr.read();
//        }
        //System.out.println(i);

        // if you want to put the data in char array
        //char[] c = new char[10]; //it will read only 10 characters
        // so to overcome this we will use different methods

        File f = new File("info.txt");
        FileReader fr = new FileReader(f);

        char[] c = new char[(int)f.length()];
        fr.read(c);
        for(char ch : c){
            System.out.print(ch);
        }
// this approach is good always
        fr.close();


    }
}
