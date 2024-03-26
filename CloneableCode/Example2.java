package CloneableCode;

class Cat{
    int j;
    Cat(int j){
        this.j = j;
    }
}

class Dog implements Cloneable{
    Cat c;
    int i;
    Dog(Cat c ,int i){
        this.c = c;
        this.i = i;
    }
    public Object clone() throws CloneNotSupportedException{

        /*for using deep cloning we will do this
        creating two objects separately
        *  Cat c1 = new Cat(c.j);
        *  Dog d1 = new Dog(c1,i);
        *  return d1;
        *
        *
        *
        *
        * */
        return  super.clone();
    }
}
public class Example2 {
    public static void main(String[] args) throws  CloneNotSupportedException {
        Cat c = new Cat(10);
        Dog d=  new Dog(c,20);

        Dog d1 = (Dog) d.clone();
        d1.c.j = 100;
        d1.i = 200;

        System.out.println(d.c.j + "===>" + d.i);
        System.out.println(d1.c.j + "===>" + d1.i );

    }
}
// it is not complete cloning so this type of cloning is called shallow cloning