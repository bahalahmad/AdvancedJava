package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Map2 {
    public static void main(String[] args) {
//        HashMap hm = new HashMap();
//
//        Integer i1 = new Integer(10);
//        Integer i2 = new Integer(10);
//        hm.put(i1,"Sachin");
//        hm.put(i2,"Messi");
//
//        System.out.println(hm); // here both will not get printed it will get updated

        IdentityHashMap hm = new IdentityHashMap(0);
        
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        hm.put(i1,"Sachin");
        hm.put(i2,"Messi");

        System.out.println(hm);
    }
}

