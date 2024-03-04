package Map;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(7,"Dhoni");
        hm.put(45,"Rohit");
        hm.put(10,"Sachin");
        hm.put(12,"Kohli");

        System.out.println(hm);

        Set s  =hm.keySet();
        System.out.println(s);
        System.out.println(s.getClass().getName());
        System.out.println();

        Collection c = hm.values();
        System.out.println(c);
        System.out.println(c.getClass().getName());
        System.out.println();

        Set mapData  = hm.entrySet();
        System.out.println(mapData);
        System.out.println(mapData.getClass().getName());
        System.out.println();

        Iterator itr = mapData.iterator();
        while(itr.hasNext()){
            Map.Entry data = (Map.Entry)itr.next();
            System.out.println(data.getKey() + " : " + data.getValue() );
            if(data.getKey().equals(10)){
                data.setValue("SRK");
            }
        }
        System.out.println();
        System.out.println(hm);










    }
}
