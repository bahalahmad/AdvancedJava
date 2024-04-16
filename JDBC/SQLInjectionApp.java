package JDBC;

import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;

public class SQLInjectionApp {

    //USAGE OF STATEMENT OBJECT LEAD TO SQLinjection
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","bahal");
        Statement statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username");
        String uname = scanner.next();

        System.out.println("Enter the password");
        String passwod = scanner.next();

        uname = " ' " + uname + " ' ";
        passwod = " ' " + passwod + " ' ";

        String query = "SELECT count(*) from users where username = " + uname + "and password = " + passwod + " ";

        ResultSet resultSet = statement.executeQuery(query);
    
        int count = 0;
        if(resultSet.next()){
            count =resultSet.getInt(1);

        }
        if(count ==1){
            System.out.println("valid credentials");
        }
        else{
            System.out.println("Invalid credenetials");
        }

        scanner.close();
        connection.close();
    }
}
