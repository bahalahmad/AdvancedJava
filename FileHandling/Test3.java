package FileHandling;

import java.io.BufferedReader;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.PrintWriter;

//write a program to perform extraction of mobile no only if there is no duplicates
public class Test3 {
    public static void main(String[] args) throws Exception {

        PrintWriter pw = new PrintWriter("file3.txt");

        BufferedReader br1  = new BufferedReader(new FileReader("demo.txt"));
        BufferedReader br2  = new BufferedReader(new FileReader("bw.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();
        while(line1!=null){
            boolean isAb = false;
            while(line2!=null){
                if(line1.equals(line2)){
                    isAb= true;
                    break;
                }
                line2 = br2.readLine();
            }
            if(!isAb) {
                pw.println(line1);
                pw.flush();
            }
            line1 = br1.readLine();
        }
        br1.close();
        br2.close();
        pw.close();
    }

}
