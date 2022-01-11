package com.java.capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class AdminLogServlet
 */
@WebServlet("/AdminLogServlet")
public class AdminLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int checkMatchrr1, checkMatchrr2;
	
	/*author geeksforgeeeks - email validation function only*/
	
	public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
       
   
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException 
				{ 
					try { 

						
						
						String press = request.getParameter("activateServletAdminLog");
						
						if (press == null) {
						    //no button has been selected
							
						} else if (press.equals("Sign-In")) {				
						    //Sign-In button was pressed
							
							
							
													
										
										String enteredUserName = request.getParameter("logAdminEmail"); 
										String enteredPassword = request.getParameter("logAdminPassword");
										
										if (!(isValid(enteredUserName))) {
											
											PrintWriter out = response.getWriter(); 
											out.println("Please Enter your email in a proper format!.");
										}
										else {
											
											
											
											//Fetch Original Credential to Compare
											// Initialize the database 
											Connection con = LogConnection.initializeDatabase(); 
											
											
											String sql = "SELECT adminEmail, adminPassword " +  "FROM AdminOriginalCredentials";
											
								            Statement stmt  = con.createStatement();
								            ResultSet rs    = stmt.executeQuery(sql);
											
								           
								            PrintWriter out = response.getWriter(); 
											  
								            
								            while (rs.next()) 
								            {  
								                String lUN = rs.getString("adminEmail");  
								                String lPS = rs.getString("adminPassword");  
								                if (enteredUserName.equals(lUN)) {
								                	  checkMatchrr1 = 1;
								                	}

								                	if (enteredPassword.equals(lPS)) {
								                	  checkMatchrr2 = 1;
								                	}

								            } 	
								                 
								                 
								            
								             
								            if (checkMatchrr1==1 && checkMatchrr2 == 1) {
								            	
								            	
								            	RequestDispatcher dispatcher = request.getRequestDispatcher("Admin-CRUD-ALL.jsp");
								                dispatcher.forward(request, response);
								            }
							                	else
							                	{				                	
							                	out.println("Wrong logins.Get to previous page and try again.");
							                	}
								            out.println("</body></html>");  
								          con.close(); 
										}

										
							 
								    	
						}  
						
						else if (press.equals("Forgot-Your-Password")) {
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
