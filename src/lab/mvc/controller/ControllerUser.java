package lab.mvc.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import lab.mvc.dao.UserDao;
import lab.mvc.model.UserInfo;


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
		
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserDao userDao = new UserDao();
		UserInfo user = userDao.judgeUserPassword(email, password);
		
		String message = "email and password are not correct！";

		if (user == null) {

			request.setAttribute("message", message);
			
//			response.getWriter().println("incorrect！");  

			request.getRequestDispatcher("login.jsp").forward(request,response);
			


		}else{
			request.getRequestDispatcher("index.jsp").forward(request,response);

		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String houseId = request.getParameter("houseId");
		String email = request.getParameter("email");
		String password  = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String tel = request.getParameter("tel");
		//前台数据 from表单数据
		
		UserInfo user = new UserInfo(); //实例化一个model对象
		user.setHouseId(houseId);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setTel(tel);
		//前台form表单数据存进model
		
		
		
		UserDao userDao = new UserDao();//实例化数据库操作对象
		userDao.insertUser(user);//调用方法
		request.getRequestDispatcher("login.jsp").forward(request,response);


	}	
		

}
