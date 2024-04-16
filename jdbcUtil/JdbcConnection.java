package jdbcUtil;

import java.sql.*;

public class JdbcConnection {

    private JdbcConnection() { // we don't object to be created for this class

    }


    public static Connection getJdbcConnection() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/enterprisejava";
        String user = "root";
        String password = "Sahil@x786";


        try {
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                return connection;
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
//        try {
//
//                if (resultSet != null) {
//                    resultSet.close();
//                }
//                if (statement != null) {
//                    statement.close();
//                }
//
//                if (connection != null) {
//                    connection.close();
//
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }


            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();

            }


        }
}

//It's am API code if any problem come throw it to the user who will call the method
// don't handle it by yourself
