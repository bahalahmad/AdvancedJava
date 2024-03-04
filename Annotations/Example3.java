package Annotations;

import javax.swing.text.Element;
import java.lang.annotation.*;

//TARGET MEANS where you want to use the information
@Target({ElementType.TYPE, ElementType.METHOD}) //type means class here
//retention policy will tell whether you want till run time or compile time
@Retention(RetentionPolicy.RUNTIME)

//Target retention is using "Enums" here for like METHOD,TYPE,RUNTIME

//this is annotation and has some information this is not a method this is properties
@interface CricketPlayer{
    String gameName(); // default "Cricket";
    int runs();  //default 20000;
}

//@ specifies compiler that annotations type is being created
@CricketPlayer(gameName = "CricketPlayer",runs = 20000) //we can also pass information while using annotations
class Virat{
    private String name;
    private int age;

    public void disp(){
        System.out.println("Virat is a Great Player ");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Virat virat = new Virat();
        virat.disp();
        Class c = virat.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)a;
        System.out.println(cp.gameName());
        System.out.println(cp.runs());

    }

}
