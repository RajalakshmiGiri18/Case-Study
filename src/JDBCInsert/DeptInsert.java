package JDBCInsert;
import java.sql.*;

public class DeptInsert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdata","root","Nte#25");
		Statement stmt=conn.createStatement();
		String s="insert into dept values(50,'Analytics','Hyderabad')";
		stmt.execute(s);
		String s2="insert into dept values(60,'Development','Chennai')";
		stmt.execute(s2);
		conn.close();
	    System.out.println("Query got executed");	
	}

}
