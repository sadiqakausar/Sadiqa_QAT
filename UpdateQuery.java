import java.sql.*;

public class UpdateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username="SYSTEM";
		String password="root";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
	
		Statement stmt=con.createStatement();
		
		String updat="UPDATE STUDENT SET ID =2 WHERE Id=3";
		stmt.executeUpdate(updat);
		
		
		ResultSet rs=stmt.executeQuery("SELECT id,name,salary FROM STUDENT where ID=2 ");
		System.out.println("QUERY executed");
		
		while(rs.next()) {
			
			System.out.println(rs.getString("id")+":"+rs.getString("name")+":"+rs.getString("salary"));
		}
		con.close();

	}

}

