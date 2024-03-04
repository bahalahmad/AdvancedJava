package Varargs;

public class VarargsDemo {
    public static void main(String[] args) {
        Calc cal = new Calc();
        System.out.println(cal.add(4,5,3,4,5,6));
    }
}
class Calc{
    /*public int add(int a, int b){
        return a+b;
    }*/

    public  int add(int ... nums){
        int sum = 0;
        for(int i:nums){
            sum = sum + i;
        }
        return sum;
    }
}
// if we want to pass as number of arguments as we want we use varargs