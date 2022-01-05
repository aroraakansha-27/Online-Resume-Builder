import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/candidate";
	private String dbUname = "root";
	private String dbPassword = "123456";
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			
		   con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public String insert(Member member)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into new_table values(?,?,?,?)";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
	    ps.setString(1, member.getUname());
	    ps.setString(2, member.getPassword());
	    ps.setString(3, member.getEmail());
	    ps.setString(4, member.getPhone());
		
		ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			result = "Data not entered";
		}
		return result;
	}

	public boolean validate(Member loginBean) {
		// TODO Auto-generated method stub
		return false;
	}

}
	
	
	

