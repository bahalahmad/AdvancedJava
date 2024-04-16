package JDBC;

import jdbcUtil.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateOperation {
    public static void main(String[] args) throws ParseException, SQLException {
//        Date uDate = new java.util.Date();
//        System.out.println(uDate);
//
//        long l = uDate.getTime();
//
//        java.sql.Date sqlDate = new java.sql.Date(l);
//        System.out.println(sqlDate);

            Connection connection = null;
            PreparedStatement pstmt = null;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name : ");
            String name = scanner.next();

            System.out.println("Enter the dob :: (dd-mm-yyyy)");
            String sdob = scanner.next();

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            java.util.Date uDate = sdf.parse(sdob);

            long time = uDate.getTime();

            java.sql.Date sqlDate = new java.sql.Date(time);

            System.out.println("String dob is ::" + sdob);
            System.out.println("Util Date is ::" + uDate);
            System.out.println("SQL Date is ::" + sqlDate);



            try{
                connection = JdbcConnection.getJdbcConnection();

                String sqlInsertQuery = "insert into userData(`name`,`dob`)values(?,?)";
                if(connection!=null){
                   pstmt =  connection.prepareStatement(sqlInsertQuery);

                   if(pstmt!=null){
                       pstmt.setString(1,name);
                       pstmt.setDate(2,sqlDate);

                       int rowAffected = pstmt.executeUpdate();

                       System.out.println("No of rows affected is ::" + rowAffected);

                   }
                }
            }catch (SQLException se){
                se.printStackTrace();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            finally {
                JdbcConnection.closeConnection(null,pstmt,connection);
                if(scanner!=null){
                    scanner.close();
                }
            }




    }
}
// from util.Date get time that will give information in long