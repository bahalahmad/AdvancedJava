package Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Map3 {
//    public static void main(String[] args) throws Exception {
//        HashMap hm = new HashMap();
//        Temp t = new Temp();
//        hm.put(t,"Hey");
//        System.out.println(hm); //{temp=hey}
//
//        t = null; //making eligible for garbage collection
//        System.gc(); // triggering garbage collector thread to clean t
//        Thread.sleep(5000);
//
//        System.out.println(hm);
//    }


// here what will happen is HashMap will dominate garabage collector and it wont allow gc to clean the object so
// both time the output will be {temp = hey} so to make it as null we will use weakHashmap

    public static void main(String[] args) throws Exception {
        WeakHashMap hm = new WeakHashMap();
        Temp t = new Temp();
        hm.put(t, "Hey");
        System.out.println(hm); //{temp=hey}

        t = null; //making eligible for garbage collection
        System.gc(); // triggering garbage collector thread to clean t
        Thread.sleep(5000);

        System.out.println(hm);
    }
}
// now the output will be
//{temp=Hey}
//Object is getting cleaned
//{}
class  Temp{
    public String toString(){
        return "temp";
    }
    @Override
    public void finalize(){
        System.out.println("Object is getting cleaned");
    }
}
