package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(6,5,2,8,1,7);
        Stream<Integer> stream = al.stream();
//        Consumer<Integer> consumer  = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        stream.forEach(consumer);
        // we are creating a consumer object here consumer will take a value and we can do whatever we want to do
        //for each will take a value from stream and give it to consumer then your consumer will pass the value to accept
        // method then you can do whatever you want to do. It is a functional interface we can just directly write in lambda expression

        //stream.forEach(Integer-> System.out.println(Integer));
       // stream.forEach(Integer-> System.out.println(Integer)); once you work on the stream you cant reuse it,



//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if(integer%2==1){
//                    return true;
//                }
//                else{
//                    return false;
//                }
//            }
//        };
        //Predicate<Integer> predicate = n->n%2==1; we can also write like this or


        Stream<Integer> stream1 = al.stream();  //every time we have to create new stream object we can't reuse it
        //Stream<Integer> stream2 = stream1.filter(predicate);//we are using filter with the help of predicate object
        Stream<Integer> stream2 = stream1.filter(n->n%2==1);// we can reduce the number of line
        //stream2.forEach(n->System.out.println(n));

        // now we are doubling the value
//        Function<Integer,Integer> func = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        };
        //Function<Integer,Integer> func = n-> n*2;


        Stream<Integer> stream3 = stream2.map(n->n*2);
       // stream3.forEach(n->System.out.println(n));
        //now we want to sum up all the values
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer s, Integer e) {
                return s+e;
            }
        };
        //stream 3 return an integer
        System.out.println(stream3.reduce(0,binaryOperator));


    }
}
