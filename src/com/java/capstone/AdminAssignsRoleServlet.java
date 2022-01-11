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
 * Servlet implementation class AdminAssignsRoleServlet
 */
@WebServlet("/AdminAssignsRoleServlet")
public class AdminAssignsRoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try { 
	

			
			//Check if button was pressed
			String press = request.getParameter("activateAssignRoleServlet");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Assign-Role-To-User")) {				
			    //Create button was pressed
				
				
										
							
			            	String enteredUserName = request.getParameter("userName");
							String enteredUserRole = request.getParameter("userRole");
							
							
							
							
						
							
							
							
							
							// Initialize the database 
							Connection con = LogConnection.initializeDatabase(); 
							
							
							//Write (PPE New Item) data to database
							
										     PreparedStatement st = con 
											.prepareStatement("update UsersOriginalCredentials set userRole = ? where logUserName = ?;");						
										
										     			
										
										st.setString(1, enteredUserRole); 
										st.setString(2, enteredUserName);
										
										
										st.executeUpdate(); 
										
										con.close(); 
										
										
										PrintWriter out = response.getWriter(); 
											

						                	
						                 
							               
					                	  
							                out.println("User Role has been assigned Successfully! ");
							                
										
										
}
}
										catch (Exception e) { 
											e.printStackTrace(); 
										} 
							
							
	
							
			        
				            
				           
		

		
	}

}
