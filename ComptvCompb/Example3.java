package ComptvCompb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(52,41,35,16);
       // Collections.sort(al,(n1,n2)->n2-n1);

        System.out.println(al);

        //by default collection.sort sort in ascending order if we want to sort in descending order we have to use
        // comparator . Integer class is implementing comparable interface
    }
}
