package Map;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(7,"Dhoni");
        ht.put(10,"Sachin");
//        ht.put(null,"abc");
//        ht.put("abc", null); both will give runtime exception as null is not allowed in Hashtable
    }
}
