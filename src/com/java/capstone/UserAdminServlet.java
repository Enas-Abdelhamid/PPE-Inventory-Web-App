package com.java.capstone;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserAdminServlet
 */
@WebServlet("/UserAdminServlet")
public class UserAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String press = request.getParameter("activateAdminUser");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("System-Administrator")) {	
				RequestDispatcher dispatcher = request.getRequestDispatcher("Admin-Log-Form.jsp");
                dispatcher.forward(request, response);
			   
				}
			else if (press.equals("System-User")) {	
				RequestDispatcher dispatcher = request.getRequestDispatcher("User-Log-Form.jsp");
                dispatcher.forward(request, response);
			    
				}
		}
			catch (Exception e) { 
				e.printStackTrace(); 
			} 
		
		
	}

}
