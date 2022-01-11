package com.java.capstone;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrudServlet
 */
@WebServlet("/CrudServlet")
public class CrudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			
String press = request.getParameter("activateCrudServlet");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Create New PPE Item")) {				
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
			
		}
		
		
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		
		
		
		
	}

}
