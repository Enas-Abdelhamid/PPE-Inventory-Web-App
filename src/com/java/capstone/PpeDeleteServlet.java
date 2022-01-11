package com.java.capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PpeDeleteServlet
 */
@WebServlet("/PpeDeleteServlet")
public class PpeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			
			//Check if button was pressed
			String press = request.getParameter("activateDeleteServlet");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Delete-Exsisting-Item")) {				
			    //delete button was pressed
				
				String tobedeletedPpeName = request.getParameter("ppeName");
				
				Connection con = LogConnection.initializeDatabase();
				
				PreparedStatement st = con 
						.prepareStatement("delete from PPEDATA where ppeName = ?;");	
				
				
				st.setString(1, tobedeletedPpeName);
				
				st.executeUpdate(); 
				
				con.close(); 
				
				
				PrintWriter out = response.getWriter(); 
					

                	
                 
	               
            	  
	                out.println("PPE Item has been deleted Successfully! ");
	               
				
				
				
			}
			
			
			
			
			
		}
		
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		
	}

	}


