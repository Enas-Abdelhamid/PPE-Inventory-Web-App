<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Read Users</title>
<style>
body {background-color: SpringGreen;}
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
<form action="./UserReadServlet" method="post"> 
	
	
	    <div>
		<h1>Read All User Accounts</h1> 		
		
		</div>		
		<br/> 
	
	
	    
		
		<div>		
		<input type="submit" name="activateUserReadServlet" value="Read-All-Users"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>