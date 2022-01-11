<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Change Own Password</title>
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
<form action="./AdminUpdateOwnPassServlet" method="post"> 
	
	
	    <div>
		<h1>Administrator Password Updating Form</h1> 		
		
		</div>		
		<br/> 
	
	
	    <div>
		<p>For your security, change your "Administrator" password that was assigned by the software developer:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="adminNewPass"/> 
		</div>
		<br/>
		
		
		
		
		
		<div>		
		<input type="submit" name="activateAdminUpdateServlet" value="Update-Admin-Password"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>