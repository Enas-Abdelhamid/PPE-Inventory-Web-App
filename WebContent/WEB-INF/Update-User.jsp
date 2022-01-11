<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Update User</title>
<style>
body {background-color: pink;}
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
<form action="./AdminUpdateServlet" method="post"> 
	
	
	    <div>
		<h1>User Account Updating Form</h1> 		
		
		</div>		
		<br/> 
	
	
	    <div>
		<p>Enter User Name of the account to be updated:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="userName"/> 
		</div>
		<br/>
		
		
		
		<div>			
		<p>PPE Updated Password:</p> 				
		</div>		
		
		<div>		
		<input type="text" name="userNewPass"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateUserUpdateServlet" value="Update-Exsisting-User"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>