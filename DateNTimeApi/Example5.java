package DateNTimeApi;

import java.time.Year;

public class Example5 {
    public static void main(String[] args) {
        Integer data = Integer.parseInt(args[0]);
        Year year = Year.of(data);

        if(year.isLeap())
            System.out.println( year + "is leap year");
        else
            System.out.println(year + "is not a leap year");
    }
}
