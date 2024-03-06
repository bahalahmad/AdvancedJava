package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

//copy one line from bw and copy one line from demo and copy it to file2.txt
public class Test2 {
    public static void main(String[] args) throws Exception {
        PrintWriter pw  = new PrintWriter("file2.txt");
        BufferedReader br1  = new BufferedReader(new FileReader("bw.txt"));
        String line = br1.readLine();

        pw.println(line);

        br1 = new BufferedReader(new FileReader("demo.txt"));
        line = br1.readLine();

        pw.println(line);

        br1.close();
        pw.flush();
        pw.close();
    }
}

