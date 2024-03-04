package DateNTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example2 {
    public static void main(String[] args) {


        LocalDate date  = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        System.out.println(yy +"/"+mm +"/" + dd);

        int hr = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nano = time.getNano();

        System.out.printf("\n%d:%d:%d:%d",hr,min,sec,nano);

        //for holding date we have LocalDate class for holding time we have LocalTime class
        // so for holding both date and time we have LocalDateTime class
        System.out.println();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //if you want date according to yours not system time
        LocalDateTime ydt = LocalDateTime.of(1999,6,10,10,25);
        System.out.println(ydt);

    }
}

// 2024-02-25
//18:51:46.274666600   output

//2024-02-26T10:50:07.180144900 here t is a separator