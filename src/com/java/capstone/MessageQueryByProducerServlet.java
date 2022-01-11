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
@WebServlet("/MessageQueryByProducerServlet")
public class MessageQueryByProducerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static String fetchedUserID, messageTextContent;
	public static int fetchedIDInteger;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			
			//Check if button was pressed
			String press = request.getParameter("activateMessageQueryByProducer");
			
			if (press == null) {
			    //no button has been selected
				
			} else if (press.equals("Get-All-Messages-By-This-Producer")) {				
			    
				
				
				////////////////////////////
				String producerNameToSearchWith = request.getParameter("producerName"); 

				
				//Fetch-ID-Start
            	Connection conn = LogUserConnection.initializeDatabase(); 
				String sqll = "SELECT userID FROM Users WHERE UserLastName = '"+ producerNameToSearchWith+ "';";
		        Statement stmtt  = conn.createStatement();
	            ResultSet rst    = stmtt.executeQuery(sqll);
	            PrintWriter outt = response.getWriter(); 
	            while (rst.next()) 
	            {  
				fetchedUserID = rst.getString("userID");
				}
	            conn.close(); 	
	          //Fetch-ID-End
				////////////////////////////
	            System.out.print("ID of the User of concern is: ");
	            System.out.printf("%n");
	            System.out.print(fetchedUserID);
	            System.out.printf("%n");
	            int fetchedIDInteger=Integer.parseInt(fetchedUserID); 
	            
	            
	          //Fetch-Messages-Start
	        	Connection con = LogMessageConnection.initializeDatabase(); 
				String sql = "SELECT messageContent FROM Messages WHERE messageWriter = '"+ fetchedIDInteger+ "';";
		        Statement stmt  = con.createStatement();
	            ResultSet rs    = stmt.executeQuery(sql);
	            PrintWriter out = response.getWriter(); 
	            System.out.print("Messages written by Producer of Concern are: ");
	            System.out.printf("%n");
	            while (rs.next()) 
	            {  
				messageTextContent = rs.getString("messageContent");
				 System.out.print(messageTextContent);
				 System.out.printf("%n");
				}
	            con.close(); 	
	          //Fetch-Messages-End
	            
			}
			
			
			
			
			
		}
		
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
		
	}

}
