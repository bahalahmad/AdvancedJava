package JDBC;

import jdbcUtil.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementSelectApp {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sid");
        int sid = scanner.nextInt();

        String sqlSelectQuery = "select sid,sname,sage,saddr from Student where sid = ?";
        try{
            connection = JdbcConnection.getJdbcConnection();
            if(connection!=null)
                statement = connection.prepareStatement(sqlSelectQuery);
            if(statement!=null) {
                statement.setInt(1, sid);
                resultSet = statement.executeQuery();
            }
            if(resultSet!=null){
                        while (resultSet.next()){
                            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2)+ "\t" + resultSet.getInt(3) + "\t" + resultSet.getString(4) );
                        }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            JdbcConnection.closeConnection(resultSet, statement, connection);
            if(scanner!=null){
                scanner.close();
            }
        }
// we can use a same prepared statement object and set it again and again
// in statement object everytime the query should be sent
    }
}
