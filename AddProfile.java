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
 * Servlet implementation class AddProfile
 */
@WebServlet("/AddProfile")
public class AddProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/candidate";
		String user = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url,user,password);
		String sql = "INSERT INTO profile (username,experience, contact, education, skills) VALUES (?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		 stmt.setString(1, request.getParameter("username"));
		 stmt.setString(2, request.getParameter("experience"));
		 stmt.setString(3, request.getParameter("contact"));
		 stmt.setString(4, request.getParameter("education"));
		 stmt.setString(5, request.getParameter("skills"));
		int rowsInserted = stmt.executeUpdate();
		if (rowsInserted > 0)
		{
		 System.out.println("Insertion Successful!");
		 
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
