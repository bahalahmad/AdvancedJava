package JDBC;

import jdbcUtil.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementApp {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement statement = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int sage = scanner.nextInt();

        System.out.println("Enter the sname");
        String sname = scanner.next();

        System.out.println("Enter the Address");
        String saddr = scanner.next();

        String sqlInsertQuery = "insert into student(`sname`,`sage`,`saddr`) values(?,?,?)";
        try{
            connection = JdbcConnection.getJdbcConnection();
            if(connection!=null){
                statement = connection.prepareStatement(sqlInsertQuery);
            }
            if(statement!=null){
                statement.setString(1,sname);
                statement.setInt(2,sage);
                statement.setString(3,saddr);

                int rowAffected = statement.executeUpdate();
                System.out.println("No of rows Affected is :: " + rowAffected);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
                JdbcConnection.closeConnection(null, statement, connection);
                if(scanner!=null){
                    scanner.close();
                }
        }
// we can use a same prepared statement object and set it again and again
// in statement object everytime the query should be sent
    }
}
