package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        List<String> al1 = new ArrayList<String>();
        Collection<String> al2 = new ArrayList<String>();

        //List<Object> al3 = new ArrayList<String>();  //invalid statement

    }
}
