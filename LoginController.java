package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ModelCls;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginController() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String uname= request.getParameter("id");
		String pass1= request.getParameter("pass");
		ModelCls m1= new ModelCls(uname, pass1);
		int x=m1.checkData();
		if(x==0)
		{
			pw.println("Valid User");
		}
		else
		{
			pw.println("Invalid user");
		}
	}

}
