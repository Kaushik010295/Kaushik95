package com.model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginControllerRayban")
public class LoginControllerRayban extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginControllerRayban() {
    
    }

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter abc=response.getWriter();
		String UserId=request.getParameter("txt");
    	String pass2=request.getParameter("pass3");
    	ModelCLs1 m2 = new ModelCLs1(UserId,pass2);
    	int y=m2.VerifyDetails();
    	if(y==0)
    	{
    		abc.println("Valid");
    	}
    	else
    	{
    		abc.println("Invalid");
    	}
    	
    			
         
	}

	
	 

}
