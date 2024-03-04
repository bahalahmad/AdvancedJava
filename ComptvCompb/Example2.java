package ComptvCompb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class ComparatorEx implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.age - o2.age;
//    }
//}  we don't have to use another class we can use anonymous inner class

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Bahal",24,"JAVA"));
        list.add(new Student("Ahmad",23,"SQL"));
        list.add(new Student("Sahil",25,"PYTHON"));
//
        //Comparator<Student> comp 1 = new Comparator<>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.age - o2.age;
//            }
//        };  we can also write like this

       //Comparator<Student> comp = (s1,s2)-> s1.age - s2.age; // we can write this in one line using lamda expression
//        Collections.sort(list,comp);

          Collections.sort(list,(s1,s2)-> s1.age - s2.age);

        System.out.println(list);
    }
}
