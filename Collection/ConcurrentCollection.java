package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection {
    public static void main(String[] args) {
//        ArrayList al  = new ArrayList();
//        al.add("A");
//        al.add("B");
//        al.add("C");
//
//        Iterator itr = al.iterator(); // fail fast iterator
//        while((itr.hasNext())){
//            String data = (String) itr.next();
//            System.out.println(data);
//
//            //Assume one more thread is doing up modification on ArrayList
//            al.add("D");  // Trying to change the structure on array list

        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        Iterator itr = al.iterator(); // fail fast iterator
        while((itr.hasNext())){
            String data = (String) itr.next();
            System.out.println(data);
            al.add("F");
        }
    }
}
//It will generate an exception
//because someone is trying to read and one more fella is trying to change due to which jvm dont know what its to be done
// Fail fast - while one thread is trying to perform an operation and if another thread is trying to do some
// structural modification to the same collection object then immediately iterator would fail by resulting an exception
// called concurrent modification exception

// If we dont want the exception to occur even during multithreading events then prefer using concurrent collection
//which support concurrent modification