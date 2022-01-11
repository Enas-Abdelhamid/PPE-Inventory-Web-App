
package com.java.capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminCrudUserServlet
 */
@WebServlet("/AdminCrudUserServlet")
public class AdminCrudUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
String press = request.getParameter("activateCrudServletadmin");
			
			if (press == null) {
			    //no button has been selected
				
			}
			
			
			else if (press.equals("Change my Admin Password")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("change-pass-form.jsp");
                dispatcher.forward(request, response);
			}
			else if (press.equals("Read All User Accounts")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("Read-Users.jsp");
                dispatcher.forward(request, response);
			}
			else if (press.equals("Update A User Account")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("Update-User.jsp");
                dispatcher.forward(request, response);
			}
			else if (press.equals("Delete A User Account")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("Delete-User.jsp");
                dispatcher.forward(request, response);
			}
			
			else if (press.equals("Assign Role to a User")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("Admin-Assign-Role.jsp");
                dispatcher.forward(request, response);
			}
			
			else if (press.equals("Create New PPE Item")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("ppe-create-form.jsp");
                dispatcher.forward(request, response);
			}
			
			else if (press.equals("Read All PPE Items")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("ppe-read-form.jsp");
                dispatcher.forward(request, response);
			}
			
			else if (press.equals("Update A PPE Item")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("ppe-update-form.jsp");
                dispatcher.forward(request, response);
			}
			
			else if (press.equals("Delete A PPE Item")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("ppe-delete-form.jsp");
                dispatcher.forward(request, response);
			}
			else if (press.equals("Log-Out")) {				
				RequestDispatcher dispatcher = request.getRequestDispatcher("userORadmin.jsp");
                dispatcher.forward(request, response);
			}
			
		}
		
		
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		
		
		
		
	}

}
