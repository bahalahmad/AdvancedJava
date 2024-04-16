package JDBC;

import jdbcUtil.JdbcConnection;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateRetreivalOperation {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = scanner.next();



        String selectQuery = "select name,dob from userdata  where name = ?";

        try{
            connection = JdbcConnection.getJdbcConnection();
            if(connection!=null){
                pstmt =  connection.prepareStatement(selectQuery);
                if(pstmt!=null) {
                    pstmt.setString(1, name);
                    resultSet = pstmt.executeQuery();
                    if (resultSet != null) {
                        if (resultSet.next()) {
                            String userName = resultSet.getString(1);
                            Date userDob = resultSet.getDate(2);


                            //formatting the output as per the user choice(based on zone)
                            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                            String date = sdf.format(userDob);

                            System.out.println("Name is  :: " + userName);
                            System.out.println("Dob is :: " + date);
                        }
                        else {
                            System.out.println("Record is not available for the given name ");
                        }
                    }
                }
            }
        }catch (SQLException se){
            se.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            JdbcConnection.closeConnection(resultSet,pstmt,connection);
            if(scanner!=null){
                scanner.close();
            }
        }
    }
}
