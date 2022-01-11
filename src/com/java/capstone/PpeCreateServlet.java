package com.java.capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PpeCreateServlet
 */
@WebServlet("/PpeCreateServlet")
public class PpeCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
try { 
	

			
			//Check if button was pressed
			String press = request.getParameter("activateCreateServlet");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Create-New-Item")) {				
			    //Create button was pressed
				
				
										
							
			            	String enteredPpeSN = request.getParameter("ppeSN");
							String enteredPpeName = request.getParameter("ppeName");
							String enteredPpeBrand = request.getParameter("ppeBrand");
							String enteredPpeSupplier = request.getParameter("ppeSupplier");
							String enteredPpeLocation = request.getParameter("ppeLocation");
							String enteredPpeQuantity = request.getParameter("ppeQuantity");
							
							int SN=Integer.parseInt(enteredPpeSN);  
							int QTY=Integer.parseInt(enteredPpeQuantity);
							
						
							
							
							
							
							// Initialize the database 
							Connection con = LogConnection.initializeDatabase(); 
							
							
							//Write (PPE New Item) data to database
							
										     PreparedStatement st = con 
											.prepareStatement("insert into PPEDATA values(?, ?, ?, ?, ?, ?"
													+ ")");						
										
										     			
										st.setInt(1, SN); 
										st.setString(2, enteredPpeName); 
										st.setString(3, enteredPpeBrand);
										st.setString(4, enteredPpeSupplier);
										st.setString(5, enteredPpeLocation);
										st.setInt(6, QTY); 
							
										
										st.executeUpdate(); 
										
										con.close(); 
										
										
										PrintWriter out = response.getWriter(); 
											

						                	
						                 
							               
					                	  
							                out.println("PPE Item has been created Successfully! ");
							                
										
										
}
}
										catch (Exception e) { 
											e.printStackTrace(); 
										} 
							
							
	
							
			        
				            
				           
		

		
	}

}
