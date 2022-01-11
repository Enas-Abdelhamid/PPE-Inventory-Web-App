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
 * Servlet implementation class UserUpdateServlet
 */
@WebServlet("/MessageQueryBySubscriberServlet")
public class MessageQueryBySubscriberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static String fetchedUserID, messageTextContent, fetchedProducerID;
	public static int fetchedIDInteger, fetchedIDIntegerSearch;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			
			//Check if button was pressed
			String press = request.getParameter("activateMessageQueryBySubscriber");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Get-All-Messages-This-Subscriber-Can-See")) {				
			    
				
				
				////////////////////////////
				String subscriberNameToSearchWith = request.getParameter("subscriberName"); 

				
				//Fetch-ID-Start
				
            	Connection conn = LogUserConnection.initializeDatabase(); 
				String sqll = "SELECT userID FROM Users WHERE UserLastName = '"+ subscriberNameToSearchWith+ "';";
		        Statement stmtt  = conn.createStatement();
	            ResultSet rst    = stmtt.executeQuery(sqll);
	            PrintWriter outt = response.getWriter(); 
	            while (rst.next()) 
	            {  
				fetchedUserID = rst.getString("userID");
				fetchedIDIntegerSearch=Integer.parseInt(fetchedUserID); 
				}
	            System.out.print("ID of the User of concern is: ");
	            System.out.printf("%n");
	            System.out.print(fetchedIDIntegerSearch);
	            System.out.printf("%n");
	             
	            
	            ////
	            
	            String sqlll = "SELECT producerID FROM Subscriptions WHERE subscriberID = '"+ fetchedIDIntegerSearch+ "';";
		        Statement stmttt  = conn.createStatement();
	            ResultSet rstt    = stmttt.executeQuery(sqlll);
	            PrintWriter outtt = response.getWriter(); 
	            while (rstt.next()) 
	            {  
				fetchedProducerID = rstt.getString("producerID");
				System.out.print("ID of the User of concern is: ");
	            System.out.printf("%n");
	            System.out.print(fetchedProducerID);
	            System.out.printf("%n");
				}
	            
	            ////
	            
	            
	            conn.close(); 	
	          
	             
	            
	            
	        	
	          
	            
			}
			
			
			
			
			
		}
		
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		
	}

}
