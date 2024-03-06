package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Example6 {
    public static void main(String[] args) throws  Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
        bw.write(78);
        bw.write("Neuron");
        bw.newLine();
        bw.write("Technology");
        bw.newLine();

        char[] ch = {'a','b','c'};
        bw.write(ch);

        bw.flush();
        bw.close();

    }
}
