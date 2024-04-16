package JDBC;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class TestApp {

    public static void main(String[] args) throws SQLException {

    //step -1 load and register the Driver
    Driver driver = new Driver();//creating driver object for MYSQLDB

   DriverManager.registerDriver(driver);
        System.out.println("Driver registered successfully");


        //step 2- Establish the connection between java and database

        //JDBC URL SYntax :: <mainprotocol>:<subprotocol>:<subname>

        String url = "jdbc:mysql://localhost:3306/enterprisejava";
        String username = "root";
        String pwd =   "Sahil@x786";
       // DriverManager.getConnection(url,username,pwd);


        Connection connection = DriverManager.getConnection(url,username,pwd);
        System.out.println(connection);

        System.out.println("Implementation class name of connection is +" + connection.getClass().getName());

        //step 3 - create a statement object
        Statement statement = connection.createStatement();
        System.out.println("Statement object is created " + statement);

        //step 4 - send and execute the query
        String sqlSelectQuery = "select sid,sname,sage,saddr from Student ";
        ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
        System.out.println("ResultSet Object is created " + resultSet);



        //step 5 - process the result from resultset
        while(resultSet.next()){
           Integer id =  resultSet.getInt(1);
           String name = resultSet.getString(2);
           Integer age = resultSet.getInt(3);
           String team  = resultSet.getString(4);

            System.out.println(id + "\t");
        //step 6 - close the connection
         connection.close();




        }


        connection.close();















    }
}

