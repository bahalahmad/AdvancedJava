package FileHandling;


//requirement 1- read data from bw.txt and demo.txt amd copy both the contents to file.txt


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test1 {

    public static void main(String[] args) throws Exception {
        PrintWriter pw  = new PrintWriter("file.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("bw.txt"));

        String line = br1.readLine();
        while(line!=null){
            pw.println(line);
            line = br1.readLine();
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader("demo.txt"));

        line = br2.readLine();
        while(line!=null){
            pw.println(line);
            line = br2.readLine();
        }
        br2.close();

        pw.flush();
        pw.close();


    }

}
