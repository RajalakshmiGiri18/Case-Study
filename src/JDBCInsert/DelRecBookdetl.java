package JDBCInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DelRecBookdetl {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","Nte#25");
		Statement stmt=conn.createStatement();
		String s="delete from book_detl where book_no='CS002'";
		stmt.execute(s);
		System.out.println("record deleted in sal table");

	}

}
