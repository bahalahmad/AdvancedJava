package ComptvCompb;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

//interface Comparable{
//    int comapareTo(Object obj);
//}
//class Demo implements Comparator{
//    public int compare(Object obj1,Object obj2){
//        //write the logic of sorting as per use requirements
//
//    }
//}

class Employee  implements  Comparable<Employee>{
    int eid;
    String name;

    Employee(int eid,String name){
        this.eid = eid;
        this.name = name;
    }
    public String toString(){
        return eid + "----->" + name;
    }

    @Override
    public int compareTo(Employee o) {
        // sort the object based on id in ascending order
        int eid1 = this.eid;
        int eid2 = o.eid;

        return eid1-eid2;
        //return this.name.compareTo(that.name); //if you want to sort according to name
    }
}

class Mycomparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        String e1name = o1.name;
        String e2name = o2.name;

        return e1name.compareTo(e2name);
    }
}
public class Example6 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Employee(10,"Sachin"));
        ts.add(new Employee(7,"Dhoni"));
        ts.add(new Employee(14,"Ponting")); //e2.compareTo(e1);
        ts.add(new Employee(9,"Lara"));
        ts.add(new Employee(11,"Sangaakara"));

        //if you will give this to jvm,jvm will say i have to sort it, jvm will call compareTo() method
        //Compulsory the object should implement Comparable

        System.out.println(ts);

        System.out.println();

        TreeSet ts1 = new TreeSet(new Mycomparator());
        ts1.add(new Employee(10,"Sachin"));
        ts1.add(new Employee(7,"Dhoni")); //compare(ts1,ts2)
        ts1.add(new Employee(14,"Ponting"));
        ts1.add(new Employee(9,"Lara"));
        ts1.add(new Employee(11,"Sangaakara"));


        //jvm uses Mycomparator compare to short the objects added into TreeSet


        System.out.println(ts1);
    }
}
