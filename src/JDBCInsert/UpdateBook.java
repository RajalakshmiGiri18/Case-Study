package JDBCInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateBook {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","Nte#25");
		Statement stmt=conn.createStatement();
		String s="update book_detl set author='Rajalakshmi' where book_no='CS004'";
		stmt.execute(s);
		conn.close();
		System.out.println("Table Updated");

	}

}
