<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER LOG FORM</title>
<style>
body {background-color: powderblue;}
div {
  display: flex;
  justify-content: space-between;
}
h1 {
  color: purple;
  font-family: courier;
  font-size: 110%;
}
</style>
</head>
<body>

<!-- The form posts its data collected from input type to "LogServlet" java servlet -->
	
	<form action="./LogServlet" method="post"> 
	
	
	    <div>
		<h1>Enter your Data to Sign-In:</h1> 		
		</div>		
		
	
	
	    <div>
		<p>Enter your user name:</p> 		
		<p>Enter your password:</p> 		
		</div>		
		 
		
		<div>
		<input type="text" name="logName"/> 
		<input type="text" name="logPass"/>
		 
		</div>
		<br/>
		
		<div>		
		<input type="submit" name="activateServlet" value="Sign-In"/>
		<input type="submit" name="activateServlet" value="Recover-Password"/>
		</div>
		
		<br/><br/><br/>
		
		<div>
		<h1>Enter your Data to Sign-Up:</h1> 		
		</div>		
		
		
		<div>
		<p>Enter your user name:</p> 		
		<p>Enter your password:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="registerUserName"/>
		<input type="text" name="registerPassword"/> 
		</div>
		<br/><br/> 
		
		<div>
		<h1>As a part of Sign-up, choose security question and answer it:</h1> 		
		</div>		
		 
		
	<div>
    <select name="SecurityQuestion">
    <option value="What is your best Food?">What is your best Food?</option>
    <option value="What is your best Pet name?">What is your best Pet name?</option>
    <option value="What is your Favorite Color?">What is your Favorite Color?</option>
  </select>
	</div>
	<br/> 
	
	<div>
		<input type="text" name="SecurityAnswer"/>		
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateServlet" value="Sign-Up"/>
				</div>
		
	</form> 
	
</body>
</html>
