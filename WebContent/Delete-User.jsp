<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Delete User</title>
<style>
body {background-color: orange;}
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
<form action="./UserDeleteServlet" method="post"> 
	
	
	    <div>
		<h1>User Account Deleting Form</h1> 		
		
		</div>		
		<br/> 
	
	
	    <div>
		<p>Enter User Name of the Account to be deleted:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="userName"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateUserDeleteServlet" value="Delete-Exsisting-User"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>