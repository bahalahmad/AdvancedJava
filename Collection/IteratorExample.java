package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(0);
        for(int i=1;i<=5;i++){
            al.add(i);
        }
        System.out.println(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
//Limitations
//1)using this cursor we can only move in forward direction not in backward direction
//2) using this cursor we can only perform remove operation , add the object and removing the object is not possible
//3) To overcome this limitation we need to use ListIterator

