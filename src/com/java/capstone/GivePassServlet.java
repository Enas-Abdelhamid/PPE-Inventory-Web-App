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
 * Servlet implementation class GivePassServlet
 */
@WebServlet("/GivePassServlet")
public class GivePassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int checkMatchQ1, checkMatchQ2;
	public static String pp;
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try { 

		
		String press = request.getParameter("activateGivePass");
		
		if (press == null) {
		    //no button has been selected
			
		} else if (press.equals("Send-Me-My-Password")) {				
		    //Sign-In button was pressed
			
			
			
									
						
						String enteredQuest = request.getParameter("questval"); 
						System.out.print(enteredQuest);
						String enteredAns = request.getParameter("answer");
						System.out.print(enteredAns);
						String enteredName = request.getParameter("nameval");
						System.out.print(enteredName);
						
						
						//Fetch Original Credential to Compare
						// Initialize the database 
						Connection con = LogConnection.initializeDatabase(); 
						
						
						String sql = "SELECT logPassword, securityQuestion, securityAnswer FROM UsersOriginalCredentials WHERE logUserName = '"+enteredName+ "';";
				        
						
			            Statement stmt  = con.createStatement();
			            ResultSet rs    = stmt.executeQuery(sql);
						
			           
			            PrintWriter out = response.getWriter(); 
						  
			            while (rs.next()) 
			            {  
			                String qq = rs.getString("securityQuestion");  
			                String aa = rs.getString("securityAnswer"); 
			                pp = rs.getString("logPassword"); 
			                
			                if (enteredQuest.equals(qq)) {
			                	  checkMatchQ1 = 1;
			                	}

			                	if (enteredAns.equals(aa)) {
			                	  checkMatchQ2 = 1;
			                	}

			                	
			                 
			                 
			            }  
			             
			            if (checkMatchQ1==1 && checkMatchQ2 == 1) {
			            	
			            	//Fetch-Role-Start
			            	
				            PrintWriter outt = response.getWriter(); 
				            outt.println("Your Password is: " + pp  );
				            con.close(); 					            
							//Fetch-Role-End
							
			            }
		
		
		}
		
		}
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	}

}
