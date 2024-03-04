package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i=1;i<=10;i++){
            v.addElement(i);
        }
        //System.out.println(v);  //internally v.toString() is called


        //Reading elements from collection one by one
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Integer data = (Integer) e.nextElement();
            System.out.println(data);
        }
    }
}
//Limitations -
//1) It is applicable ony on legacy classes
//2) Using this version we can perform only read operations and we cant perform remove operations
//3) to resolve this problem only we have iterator