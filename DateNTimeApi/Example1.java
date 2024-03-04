package DateNTimeApi;

public class Example1 {
    public static void main(String[] args) {
        // to use date in general operation like printing date and time
        java.util.Date date = new java.util.Date();
        System.out.println(date); //Sun Feb 25 15:46:50 IST 2024

       // java.sql.Date date1 = new java.sql.Date(); it will give a compile time error bec it accepts argument

        long time = date.getHours();
        System.out.println(time); //15


        long l = date.getTime(); // this is giving information in milisecond
        //to use date in db operations like insert update delete query
        java.sql.Date date1 = new java.sql.Date(time);

        System.out.println(date1); //1970-01-01dd


    }
}
