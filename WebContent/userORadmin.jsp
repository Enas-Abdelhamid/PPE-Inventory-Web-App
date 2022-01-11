<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Or Admin</title>
<style>
body {background-color: powderblue;}
div {
  display: flex;
  justify-content: space-between;
}
h1 {
  color: blue;
  font-family: courier;
  font-size: 110%;
}
</style>
</head>
<body>

<form action="./UserAdminServlet" method="post"> 
	
	
	    <div>
		<h1>Welcome to PPE Watchdog Web App, are you an Administrator or a User?</h1> 		
		</div>		
		
		<br/> 
		
		
		
		<div>		
		<input type="submit" name="activateAdminUser" value="System-Administrator"/>
		</div>
		
		<br/>
		
		<div>		
		<input type="submit" name="activateAdminUser" value="System-User"/>
		</div>
		
	</form> 

</body>
</html>