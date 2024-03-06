package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example7 {
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader(new FileReader("bw.txt"));

        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
