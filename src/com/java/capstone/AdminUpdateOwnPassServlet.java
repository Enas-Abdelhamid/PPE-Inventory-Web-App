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
 * Servlet implementation class AdminUpdateOwnPassServlet
 */
@WebServlet("/AdminUpdateOwnPassServlet")
public class AdminUpdateOwnPassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			
			//Check if button was pressed
			String press = request.getParameter("activateAdminUpdateServlet");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Update-Admin-Password")) {				
			    //Update button was pressed
				
				
				String tobeAdminPass = request.getParameter("adminNewPass");
				String tobeAdminName = ("ee.enas.radwan@gmail.com");
				

				Connection con = LogConnection.initializeDatabase();
				
				PreparedStatement st = con 
						.prepareStatement("update AdminOriginalCredentials set adminPassword = ? where adminEmail = ?;");	
				
				st.setString(1, tobeAdminPass); 
				st.setString(2, tobeAdminName);
				
				st.executeUpdate(); 
				
				con.close(); 
				
				
				PrintWriter out = response.getWriter(); 
					

                	
                 
	               
            	  
	                out.println("Administrator Password is updated successfully! ");
	                
				
				
				
			}
			
			
			
			
			
		}
		
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		
	}

}

