package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model3.ModelClass2;


@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public controller() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter abc=response.getWriter();
		String UserId=request.getParameter("txt");
    	String pass2=request.getParameter("pass3");
    	ModelClass2 m2 = new ModelClass2(UserId, pass2);
    	int y=m2.VerifyDetails();
    	if(y==0)
    	{
    		RequestDispatcher rd= request.getRequestDispatcher("Gadget.html");
    		abc.println("Valid");
    		rd.forward(request, response);
    	}
    	else
    	{
    		//RequestDispatcher rd= request.getRequestDispatcher("failure.html);

    		abc.println("Invalid");
    		//rd.include(request, response);

    	}
	}

}
