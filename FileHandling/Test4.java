package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

//write a program to remove duplicates from the files
public class Test4 {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("Output.txt");

        BufferedReader br = new BufferedReader(new FileReader("Temp.txt"));
        String line = br.readLine();
        boolean isAv = false;
        BufferedReader br2 = null;

        while(line!=null){
            isAv  =false;
            br2 = new BufferedReader(new FileReader("Output.txt"));
            String target = br2.readLine();

            while(target!=null) {
                if (line.equals(target)) {
                        isAv = true;
                        break;
                }
                target = br2.readLine();
            }
            br2.close();
            if(!isAv){
                pw.println(line);
                pw.flush();
            }

            line = br.readLine();
        }
        br.close();
        br2.close();
        pw.close();
    }
}
