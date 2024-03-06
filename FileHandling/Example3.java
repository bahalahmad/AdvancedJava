package FileHandling;

import javax.sound.midi.Soundbank;
import java.io.File;

public class Example3 {
    public static void main(String[] args) {
       //1) write a program to display the names of all files and directories present is G:\IPLTeam
            File f = new File("G:\\IPLTeam");
            int count = 0;
            int countFile = 0;
            int countDir = 0;
            String[] allFile = f.list();
            for(String file : allFile){
                File newF = new File(f,file);
                if(newF.isFile()){
                    countFile++;
                    System.out.println(file);
                }
                if(newF.isDirectory()){
                    countDir++;
                    System.out.println(file);
                }
                count++;
                System.out.println(file);
            }
        System.out.println("No of files and directories is :: " + count);
        System.out.println("No of files  is :: " + countFile);
        System.out.println("No of Directories is :: " + countDir);
    }
}
