package Generics;

import java.sql.SQLOutput;

class Gen<T>{
    T obj;
    Gen(T obj){
        this.obj = obj;
    }
    public void show(){
        System.out.println("The type of Object  is ::" + obj.getClass().getName())  ;
    }
    public T getObj(){
        return obj;
    }
}
public class Example2 {
    public static void main(String[] args) {
            Gen<Integer> g1 = new Gen<Integer>(10);
            g1.show();
            System.out.println(g1.getObj());
    }
}
