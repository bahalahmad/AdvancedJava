package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

        //CREATING A FILE INPUT STREAM TO READ THE DATA FROM A FILE CALLED "DATABASE.PROPERTIES"
        FileInputStream fs = new FileInputStream("/database.properties");

        // data loaded into properties object through fis
        p.load(fs);

        System.out.println(p);
        System.out.println("URL IS ::" +p.getProperty("url"));
        System.out.println("User Name is  ::" +p.getProperty("username"));
        System.out.println("Password is ::" +p.getProperty("password"));

        p.setProperty("iNeuron ","Navin Reddy"); // setting a new property
        FileOutputStream  fos = new FileOutputStream("database.properties");
        p.store(fos, "Updated properties");
        fos.close(); // Close the  FileOutputStream
    }
}
