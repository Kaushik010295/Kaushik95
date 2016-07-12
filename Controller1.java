package com.niit.Shoppingcart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Controller1")
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
 System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		String userID=request.getParameter("userID");
		
		String password=request.getParameter("Password");
		
		LoginDAO loginDAO = new LoginDAO();
		
		RequestDispatcher dispatcher;
		if((loginDAO.isValidUser(userID, password))== true)
		{
			//Navigate to home page
			dispatcher=request.getDispatcherType("home.html");
			dispatcher.forward(request,response);
		}
		else
		{
			//Navigate to Login page itself with error message
			dispatcher=request.getDispatcherType("login1.html");
			PrintWriter writer = response.getWriter();
			writer.append("Invalid");
			dispatcher.(request,response);

			

		}
	}

}
