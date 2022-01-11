package com.java.capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PpeReadServlet
 */
@WebServlet("/PpeReadServlet")
public class PpeReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//Check if button was pressed
		String press = request.getParameter("activateReadServlet");
		
		if (press == null) {
		    //no button has been selected
			
		} else if (press.equals("Read-All-Items")) {				
		    //Read button was pressed
			
			try {
				
				Connection con = LogConnection.initializeDatabase(); 				
				
				String sql = "SELECT * " +  "FROM PPEDATA";
		        
				
	            Statement stmt  = con.createStatement();
	            ResultSet rs    = stmt.executeQuery(sql);
				
	           
	            PrintWriter out = response.getWriter(); 
				out.println("<table border=1 width=80% height=50%>");  
	            out.println("<tr><th>PPE SN</th><th>PPE Name</th><th>PPE Brand</th><th>PPE Supplier</th><th>PPE Location</th><th>PPE Quantity</th><tr>");  
	            while (rs.next()) 
	            {  
	                int readSN = rs.getInt("ppeSN");  
	                String readName = rs.getString("ppeName");
	                String readBrand = rs.getString("ppeBrand");
	                String readSupplier = rs.getString("ppeSupplier");
	                String readLocation = rs.getString("ppeLocation");
	                int readQuantity = rs.getInt("ppeQuantity");  


	                	
	                 
	                out.println("<tr><td>" + readSN + "</td><td>" + readName +"</td><td>"+readBrand+"</td><td>"+readSupplier+"</td><td>"+readLocation+"</td><td>"+readQuantity +"</td></tr>");   
	            }  
	            out.println("</table>");
	            
	           
				
			}
			catch (Exception e) { 
				e.printStackTrace(); 
			} 
		
		}
		
	}

}
