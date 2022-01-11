package com.java.capstone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


import javax.mail.Session;



/**
 * Servlet implementation class RecoverPassServlet
 */
@WebServlet("/RecoverPassServlet")
public class RecoverPassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String myQuest, myAns, myName;
       
    

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
		String press = request.getParameter("activateSecurity");
		if (press == null) {
		    //no button has been selected
			
		} else if (press.equals("Ask me the Security Question")) {				
		    //Sign-In button was pressed
			String enteredUserName = request.getParameter("userName");
			System.out.print(enteredUserName);
			Connection connn = LogConnection.initializeDatabase(); 
			System.out.print(enteredUserName);
			String sqlll = "SELECT securityQuestion, securityAnswer FROM UsersOriginalCredentials WHERE logUserName = '"+ enteredUserName+ "';";
	        Statement stmttt  = connn.createStatement();
            ResultSet rstt    = stmttt.executeQuery(sqlll);
            PrintWriter outtt = response.getWriter(); 
            while (rstt.next()) 
            {  
			myQuest = rstt.getString("securityQuestion");
			myAns = rstt.getString("securityAnswer");
			//myName = rstt.getString("logUserName");
			}
            connn.close(); 	
            RequestDispatcher dispatcher = request.getRequestDispatcher("security-check.jsp");
            
            	request.setAttribute("quest", myQuest);
            	request.setAttribute("ans", myAns);
            	request.setAttribute("name", myName);
                dispatcher.forward(request, response);
		}
		}
		
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
}
}
