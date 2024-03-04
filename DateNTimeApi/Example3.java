package DateNTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example3 {
    public static void main(String[] args) {
        ZoneId id = ZoneId.systemDefault();
        System.out.println(id);

        ZonedDateTime zn = ZonedDateTime.now(id);
        System.out.println(zn);


        //if you want to check time zone of another one

        ZoneId dif  = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zn1 = ZonedDateTime.now(dif);
        System.out.println(dif);
        System.out.println(zn1);
    }
}
// to print the zone id we have separate class ZoneId in time package which extends Serializable