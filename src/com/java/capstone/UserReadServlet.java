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
 * Servlet implementation class UserReadServlet
 */
@WebServlet("/UserReadServlet")
public class UserReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Check if button was pressed
				String press = request.getParameter("activateUserReadServlet");
				
				if (press == null) {
				    //no button has been selected
					
				} else if (press.equals("Read-All-Users")) {				
				    //Read button was pressed
					
					try {
						
						Connection con = LogConnection.initializeDatabase(); 				
						
						String sql = "SELECT * " +  "FROM UsersOriginalCredentials";
				        
						
			            Statement stmt  = con.createStatement();
			            ResultSet rs    = stmt.executeQuery(sql);
						
			           
			            PrintWriter out = response.getWriter(); 
						out.println("<table border=1 width=80% height=50%>");  
			            out.println("<tr><th>User Name</th><th>User Pass</th><th>User Role</th><tr>");  
			            while (rs.next()) 
			            {  
			                  
			                String readName = rs.getString("logUserName");
			                String readPass = rs.getString("logPassword");
			                String readRole = rs.getString("userRole");
			                
			                 


			                	
			                 
			                out.println("<tr><td>" + readName + "</td><td>" + readPass +"</td><td>" + readRole + "</td></tr>");   
			            }  
			            out.println("</table>");
			            
			           
						
					}
					catch (Exception e) { 
						e.printStackTrace(); 
					} 
				
				}
				
			}

		}
