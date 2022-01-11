<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN LOG FORM</title>
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


	
	<form action="./AdminLogServlet" method="post"> 
	
	
	    <div>
		<h1>Enter your Data to Sign-In:</h1> 		
		</div>		
		<br/> 
	
	
	    <div>
		<p>Enter your admin e-mail:</p> 		
		<p>Enter your admin password:</p> 		
		</div>		
		<br/> 
		
		<div>
		<input type="text" name="logAdminEmail"/> 
		<input type="text" name="logAdminPassword"/>
		 
		</div>
		<br/>
		
		<div>		
		<input type="submit" name="activateServletAdminLog" value="Sign-In"/>
		</div>
		
		<br/><br/><br/>
		
		
		
				
	</form> 
	
</body>
</html>
