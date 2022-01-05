
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
 * Servlet implementation class DeleteProfile
 */
@WebServlet("/DeleteProfile")
public class DeleteProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProfile() {
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
		String sql = "delete from profile where username=?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement = con.prepareStatement(sql);
		statement.setString(1, request.getParameter("username"));
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) 
		{
		 System.out.println("Deleted Successfully!");
		 
		 AdminDao loginDao = new AdminDao();
			
			String username = request.getParameter("username");
		
			
			Admin loginBean = new Admin();
			loginBean.setUsername(username);
			loginBean.setPassword(password);
			
			if (loginDao.validate(loginBean))
			{
				response.sendRedirect("AdminSuccess.jsp");
				
			}
			else 
			{
				//HttpSession session = request.getSession();
				response.sendRedirect("Admin.jsp");
				
			}
		 
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
