package lab.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.mvc.model.ModelUser;
import lab.mvc.model.UserFunctions;







<<<<<<< HEAD
=======
import lab.mvc.model.UsualFunctions;
import lab.mvc.model.UserModel;
>>>>>>> ca321f6f958836b501129de6246ebce3261dc6c3

/**
 * Servlet implementation class Controller1
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
		
//		String user = request.getParameter("email");
//		String pass = request.getParameter("password");
//		
//		
//		response.setContentType("text/html");
//	    PrintWriter out = response.getWriter();
//	    if(user.equals("abc@qq.com")&& pass.equals("123")){
//	    	request.getRequestDispatcher("HomePage.jsp").forward(request,response);
//	      }
//	    else{
//	    	out.print("Incorrect Password");
//	      }
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserFunctions userDao = new UserFunctions();
		ModelUser user = userDao.judgeUserPassword(email, password);
		
		String message = "email and password are not correct！";

		if (user == null) {

			request.setAttribute("message", message);
			
//			response.getWriter().println("incorrect！");  
			request.getRequestDispatcher("Login.jsp").forward(request,response);
			


		}else{
			request.getRequestDispatcher("HomePage.jsp").forward(request,response);

		}
		

		
		
		
		

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDB","root","anguis5h");
//			Statement stmt = con.createStatement();
//			stmt.executeUpdate("insert into UserInfo(email,password) value('zhang','qin');");
//			System.out.println("data inserted");
//			
//			
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		String email = request.getParameter("email");
//		String password  = request.getParameter("password");
//		
//		UserInfo user = new UserInfo();
//		
//		user.setEmail(email);
//		user.setPassword(password);
//		
//		LoginDao loginDao = new LoginDao();
//		String userValidate = loginDao.authenticateUser(UserInfo);
		
<<<<<<< HEAD
		
//		String userId = request.getParameter("userId");
//		String houseId = request.getParameter("houseId");
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		String email = request.getParameter("email");
//		String password  = request.getParameter("password");
//		String tel = request.getParameter("tel");
//		
//		
//		UserInfo Userbean = new UserInfo(userId,houseId,firstName,lastName,email,password,tel);
//		request.setAttribute("UserInfo", Userbean);

//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		
//		out.println("<HTML>");
//		out.println("<HEAD><TITLE>Controller1</TITLE></HEAD>");
//		out.println("<BODY>");
//		out.println("<H1> Infomation </H1>");
//
//		out.println(request.getParameter("email")+
//				request.getParameter("password")+
//				request.getParameter("firstName")+
//				request.getParameter("lastName")+
//				request.getParameter("tel")
//				);
//		out.println("</BODY></HTML>");
//		
//		out.close();
=======
		response.setContentType("text/html");
		response.setCharacterEncoding( "UTF-8" );
		PrintWriter out = response.getWriter();
		 
		out.println("<doctype><html><head><title></title></head><body>");
		try {
			UsualFunctions f = new UsualFunctions();
			Connection c = f.connectDB();
>>>>>>> ca321f6f958836b501129de6246ebce3261dc6c3
		
		
		

//		try {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/UserDB","root","anguis5h");
//		Statement stmt = con.createStatement();
//		stmt.executeUpdate("insert into UserInfo(email,password,firstName,lastName,tel) value('"+ request.getParameter("email") +"','"+ request.getParameter("password") +"','"+ request.getParameter("firstName") +"','"+ request.getParameter("lastName") +"','"+ request.getParameter("tel") +"');");
//		System.out.println("data inserted");
//		request.getRequestDispatcher("Login.jsp").forward(request,response);
//		
//		
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		
		

		String houseId = request.getParameter("houseId");
		String email = request.getParameter("email");
		String password  = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String tel = request.getParameter("tel");
		//前台数据 from表单数据
		
		ModelUser user = new ModelUser(); //实例化一个model对象
		user.setHouseId(houseId);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setTel(tel);
		//前台form表单数据存进model
		
		
		
		UserFunctions userDao = new UserFunctions();//实例化数据库操作对象
		userDao.insertUser(user);//调用方法
		request.getRequestDispatcher("Login.jsp").forward(request,response);

		

		
	}
		




}


