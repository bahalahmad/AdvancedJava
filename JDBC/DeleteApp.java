// to insert  the data in database
package JDBC;

import java.sql.*;

public class DeleteApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String url = "jdbc:mysql://localhost:3306/enterprisejava";
		String user = "root";
		String password = "Sahil@x786";

		try{
			connection = DriverManager.getConnection(url,user,password);
			if(connection!=null){
				statement = connection.createStatement();

				if(statement!=null){
					String deleteSqlQuery = "delete from student where sid = 19";

					int noOfRows = statement.executeUpdate(deleteSqlQuery);
					System.out.println("No of rows deleted " + noOfRows);
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
		}

	}

}
