package FileHandling;

import java.io.PrintWriter;

public class Example8 {
    public static void main(String[] args) throws  Exception {
        PrintWriter pw = new PrintWriter("demo.txt");
        pw.write(97);
        pw.println("BC");
        pw.println("technology");
        pw.println("training");
        pw.println(100);
        pw.flush();
        pw.close();
    }
}
