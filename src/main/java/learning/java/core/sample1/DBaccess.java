package learning.java.core.sample1;

import java.sql.*;

/**
 * @date 2024-01-16
 * @version 0.0.1
 * @author Lohith.Samaga
 *
 */
public class DBaccess {
	private String dbName = "abcd";
	private String userName = "abcd";
	private String password = "abcd";
	private Connection con;
	private String ACCESS_KEY_ID = "abcd";
	private String SECRET_KEY = "abcd";
	
	public DBaccess() {
		try{
			String url = "jdbc:mysql://localhost:3306/sonoo" + dbName;
			Class.forName("com.mysql.jdbc.Driver");  
			
			con = DriverManager.getConnection(url,userName,password);  
		} catch(Exception e){
			System.out.println(e); 
		}
	}
	
	public void getData() throws Exception {
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

	}
	
	public void closeConnection() throws Exception {
		con.close();
	}

}
