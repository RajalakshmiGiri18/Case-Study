package JDBCInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SalInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","Nte#25");
		Statement stmt=conn.createStatement();
		stmt.addBatch("insert into salgrade values(6,5000,15000) ");
		stmt.addBatch("insert into salgrade values(7,8000,20000)");
		stmt.executeBatch();
		System.out.println("values inserted in sal table");
		
		
		

	}

}
