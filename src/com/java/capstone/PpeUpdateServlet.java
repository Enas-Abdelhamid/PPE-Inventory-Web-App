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
 * Servlet implementation class PpeUpdateServlet
 */
@WebServlet("/PpeUpdateServlet")
public class PpeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try
		{
			
			//Check if button was pressed
			String press = request.getParameter("activateUpdateServlet");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Update-Exsisting-Item")) {				
			    //Update button was pressed
				
				String tobePpeName = request.getParameter("ppeName");
				String tobePpeQuantity = request.getParameter("ppeQuantity");
				int tobeQTY=Integer.parseInt(tobePpeQuantity);

				Connection con = LogConnection.initializeDatabase();
				
				PreparedStatement st = con 
						.prepareStatement("update PPEDATA set ppeQuantity = ? where ppeName = ?;");	
				
				st.setInt(1, tobeQTY); 
				st.setString(2, tobePpeName);
				
				st.executeUpdate(); 
				
				con.close(); 
				
				
				PrintWriter out = response.getWriter(); 
					

                	
                 
	               
            	  
	                out.println("PPE Item has been updated Successfully! ");
	                
				
				
				
			}
			
			
			
			
			
		}
		
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		
	}

}
