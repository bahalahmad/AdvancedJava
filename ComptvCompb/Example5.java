package ComptvCompb;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Example5 {
    public static void main(String[] args) {
        //JVM  uses comparable compareTo() to sort the object added into TreeSet

        TreeSet ts = new TreeSet();//by using an interfce called comparable
        ts.add("A");
        ts.add("Z");
        ts.add("L");
        ts.add("K");
        ts.add("B");
        ts.add("S");

        //String class implements Comparable so JVM called CompareTo() and sorted in natural order
        System.out.println(ts);

        System.out.println();

        TreeSet ts1 = new TreeSet();
        ts1.add(new StringBuffer("A"));
        ts1.add(new StringBuffer("Z"));
        ts1.add(new StringBuffer("L"));
        ts1.add(new StringBuffer("K"));
        ts1.add(new StringBuffer("B"));
        ts1.add(new StringBuffer("S"));

        System.out.println(ts1);
        //default natural sorting order is ascending order

    }
}
