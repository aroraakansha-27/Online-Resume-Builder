import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/candidate";
		String user = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url,user,password);
		String sql = "UPDATE profile SET skills=?  WHERE username=?";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt = con.prepareStatement(sql);
		stmt.setString(1, request.getParameter("skills"));
		stmt.setString(2, request.getParameter("username"));
	
		int rowsUpdated = stmt.executeUpdate();
		if (rowsUpdated > 0) 
		{
		 System.out.println("Updated Successfully!");
		 
		 response.sendRedirect("login.jsp");
		}
		 }
		catch (Exception e)
		{
		e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
