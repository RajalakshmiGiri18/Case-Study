package JDBCInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","Nte#25");
		Statement stmt=conn.createStatement();
		String s="insert into emp values(7980,'Aravindh','Developer',7566,'2024-06-01',4500,600,60);";
		stmt.execute(s);
		String s2="insert into emp values(7990,'Kaushi','Analytics',7566,'2020-06-01',5000,400,50);";
		stmt.execute(s2);
		conn.close();
	    System.out.println("Query got executed");	
	}

}
