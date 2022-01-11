
package com.java.capstone;

import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;



// Servlet Name 
@WebServlet("/LogServlet") 

public class LogServlet extends HttpServlet { 
	
	private static final long serialVersionUID = 1L;
	private int checkMatchss1, checkMatchss2;
	
	
		public static String myRole;
		
	
	
	
	
protected void doPost(HttpServletRequest request, 
HttpServletResponse response) 
		throws ServletException, IOException 
	{ 
		try { 

			
			//Check which button was pressed, either sign-in or sign-up
			String press = request.getParameter("activateServlet");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Sign-In")) {				
			    //Sign-In button was pressed
				
				
				
										
							
							String enteredUserName = request.getParameter("logName"); 

							String enteredPassword = request.getParameter("logPass");
							
							
							
							//Fetch Original Credential to Compare
							// Initialize the database 
							Connection con = LogConnection.initializeDatabase(); 
							
							
							String sql = "SELECT logUserName, logPassword, userRole " +  "FROM UsersOriginalCredentials";
					        
							
				            Statement stmt  = con.createStatement();
				            ResultSet rs    = stmt.executeQuery(sql);
							
				           
				            PrintWriter out = response.getWriter(); 
							  
				            while (rs.next()) 
				            {  
				                String lUN = rs.getString("logUserName");  
				                String lPS = rs.getString("logPassword");  
				                String lUR = rs.getString("userRole");
				                if (enteredUserName.equals(lUN)) {
				                	  checkMatchss1 = 1;
				                	}

				                	if (enteredPassword.equals(lPS)) {
				                	  checkMatchss2 = 1;
				                	}

				                	
				                 
				                 
				            }  
				             
				            if (checkMatchss1==1 && checkMatchss2 == 1) {
				            	
				            	//Fetch-Role-Start
				            	Connection conn = LogConnection.initializeDatabase(); 
								String sqll = "SELECT userRole FROM UsersOriginalCredentials WHERE logUserName = '"+ enteredUserName+ "';";
						        Statement stmtt  = conn.createStatement();
					            ResultSet rst    = stmtt.executeQuery(sqll);
					            PrintWriter outt = response.getWriter(); 
					            while (rst.next()) 
					            {  
								myRole = rst.getString("userRole");
								}
					            conn.close(); 					            
								//Fetch-Role-End
								
					            
					            
				            	RequestDispatcher dispatcher = request.getRequestDispatcher("crud-options.jsp");
				            System.out.print(myRole);
				            	request.setAttribute("defineRole", myRole);
				                dispatcher.forward(request, response);
				            }
			                	else
			                	{				                	
			                	out.println("Wrong logins.Get to previous page and try again.");
			                	}
				              
				          con.close();  
							

							
			} else if (press.equals("Sign-Up")) {
			    //Sign-Up button was pressed
				
				
				// Initialize the database 
				Connection con = LogConnection.initializeDatabase(); 
				
				//Write (sign-up) data to database
				// Create a SQL query to insert data into UsersOriginalCredentials table 
							     PreparedStatement st = con 
								.prepareStatement("insert into UsersOriginalCredentials (logUserName, logPassword, securityQuestion, securityAnswer) values(?, ?, ?, ?)");						
							
							
							//First parameter is the original user name value for registration
							st.setString(1, request.getParameter("registerUserName")); 

							//First parameter is the original password value for registration
							st.setString(2, request.getParameter("registerPassword"));	
							
							
							st.setString(3, request.getParameter("SecurityQuestion"));	
							st.setString(4, request.getParameter("SecurityAnswer"));	
							

							// Execute the insert statement		
							st.executeUpdate(); 
							con.close(); 
							
							PrintWriter out = response.getWriter(); 
							out.println("You have successfully registered, get back to the previous page to sign-in. ");
			}
							else if(press.equals("Recover-Password"))
							{
								RequestDispatcher dispatcher = request.getRequestDispatcher("Recover-Password.jsp");
								dispatcher.forward(request, response);
							}
							
			else {
			    //someone has altered the HTML and sent a different value!
			}
			
			
					
			
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
	
	
	} 
