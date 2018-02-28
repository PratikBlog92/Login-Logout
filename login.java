

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		try {



			PrintWriter out = response.getWriter();
			out.print("Login");

			String uname = 	request.getParameter("uname");
			String pass =	request.getParameter("pass");

			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			PreparedStatement  ps = conn.prepareStatement("SELECT * FROM `demo` WHERE `name`=? AND `Password`=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery();
			String Dbuser=null,Dbpass=null;
			while(rs.next())
			{
				Dbuser = rs.getString("name");
				Dbpass = rs.getString("Password");
			}
			
			
			if(uname.equals(Dbuser) && pass.equals(Dbpass))
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", Dbuser);
				response.sendRedirect("/LoginANDLogout/hello.jsp");
			}
			else {
				out.print("Wrong Password");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
	}



}
