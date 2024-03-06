package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

//File
  // Write operation (FileWriter)
  // Read operation (FileReader)
public class Example4 {
    public static void main(String[] args) throws IOException {
        //if file already exist it will reuse the same file and if it doesn't exist it will create a new file and write on it
       // FileWriter fw = new FileWriter("info.txt");

        // if you dont want overriding to happen then you should do this
        // In this case it will not get overridden it will be appended
        FileWriter fw  = new FileWriter("info.txt",true);

        fw.write(73); //ASCII value of character
        fw.write("Neuron\nTechnology\n");
        char[] ch = {'a','b','c'};
        fw.write(ch);

        fw.flush();
        fw.close();




    }
}
//File constructor will never create a file
// FileWriter will first create a file and then write on it
//