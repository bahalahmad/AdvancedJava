// to insert  the data in database
package JDBC;

import java.sql.*;
import java.util.Scanner;

public class UserInsertApp {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/enterprisejava";
        String user = "root";
        String password = "Sahil@x786";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int sage = scanner.nextInt();

        System.out.println("Enter the sname");
        String sname = scanner.next();

        System.out.println("Enter the Address");
        String saddr = scanner.next();

        sname = " ' " + sname + " ' ";
        saddr = " ' " + saddr + " ' ";

        try{
            connection = DriverManager.getConnection(url,user,password);
            if(connection!=null){
                statement = connection.createStatement();

                if(statement!=null){
                    String insertSqlQuery = "insert into student(`sname`,`sage`,`saddr`)values("+sname +"," + sage +"," + saddr + ")";

                    System.out.println(insertSqlQuery);

                    int noOfRows = statement.executeUpdate(insertSqlQuery);
                    System.out.println("No of rows updated " + noOfRows);
                }
            }
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{

            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
            if(scanner!=null){
                scanner.close();
            }
        }

    }

}



// we can also use inbuilt class to do the formatting
// what if we have more than 10 variables, it would be not easy to format so here is the better approach for this
// we will use


/* String query = String.format("insert into Student `sname`,`sage`,`saddr`) values ('%s',%d,'%s')",sname,sage,saddr);*/