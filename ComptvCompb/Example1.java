package ComptvCompb;

import java.util.ArrayList;
import java.util.Collections;

class Student implements  Comparable<Student>{
     String name;
     int age;
      String Branch;

    public Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        Branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Branch='" + Branch + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return that.age - this.age;

        //return this.name.compareTo(that.name); if you want to compare the name
    }
}

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Bahal",24,"JAVA"));
        list.add(new Student("Ahmad",23,"SQL"));
        list.add(new Student("Sahil",25,"PYTHON"));

       Collections.sort(list);
        System.out.println(list);
    }
}
