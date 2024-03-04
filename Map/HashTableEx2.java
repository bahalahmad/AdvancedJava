package Map;

import java.util.Hashtable;

public class HashTableEx2 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new Temp1(5),"A");
        ht.put(new Temp1(73),"B");
        ht.put(new Temp1(25),"V");
        ht.put(new Temp1(44),"H");
    }
}
class Temp1{
    int i;
    Temp1(int i){
        this.i = i;
    }
    public int hashCode(){
        return i;
    }
    public String toString(){
        return i + " ";
    }
}
