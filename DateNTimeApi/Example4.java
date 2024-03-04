package DateNTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class Example4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(1999,6,10);

        Period period = Period.between(today,bday);
        System.out.println(period);
    }
}
