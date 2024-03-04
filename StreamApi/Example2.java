package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(6,5,2,8,1,7,9,13,14);
        int result = al.stream()
                .filter(n->n%2==1)
                .map(n->n*2)
                .reduce(0,(s,e)->s+e);
        System.out.println(result);
    }
}
