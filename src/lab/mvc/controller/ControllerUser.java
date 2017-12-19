package lab.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import lab.mvc.model.UsualFunctions;

/**
 * Servlet implementation class ControllerUser
 */
@WebServlet("/ControllerUser")
public class ControllerUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		PrintWriter out = response.getWriter();
		
		out.println("<doctype><html><head><title>Lab 1</title></head><body>");
		try {
			UsualFunctions f = new UsualFunctions();
			Connection c = f.connectDB();
		
			Statement s = c.createStatement();
			ResultSet resultat = s.executeQuery( "SELECT * FROM Users" );
			out.println(resultat);
			
			s.close();
			c.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		out.println("</body></html>");
	}
	

}
