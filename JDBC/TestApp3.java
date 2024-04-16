package JDBC;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApp3 {

	public static void main(String[] args) throws SQLException {
		
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String url = "jdbc:mysql://localhost:3306/enterprisejava";
		String user = "root";
		String password = "Sahil@x786";

		try {
			connection = DriverManager.getConnection(url,user,password);
			if(connection!=null) {
				statement = connection.createStatement();
				
				if(statement!=null) {
					String sqlSelectQuery  = "select sid,sname,sage,saddr from Student ";
					
					resultSet = statement.executeQuery(sqlSelectQuery);
					
					if(resultSet!=null) {
						while(resultSet.next()) {
							int sid = resultSet.getInt("sid");
							String name = resultSet.getString("sname");
							int sage = resultSet.getInt("sage");
							String add = resultSet.getString("saddr");
							System.out.println(sid + "\t" + name + "\t" + sage + "\t" + add);
						}
					}
				}
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception ue) {
			ue.printStackTrace();
		}
		finally{
			if(resultSet!=null) {
				resultSet.close();
			}
			if(statement!=null) {
				statement.close();
			}
			if(connection!=null) {
				statement.close();
			}
		}
		
	}

}




//Driver manager is coming from sql package , all this is present in rt.jar it is a part of jdk software
//Driver is not available in rt.jar , it is available in third party software which is given by respective db vendor
 