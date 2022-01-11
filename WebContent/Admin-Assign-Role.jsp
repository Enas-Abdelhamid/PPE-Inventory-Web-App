<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Assigns Role</title>
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
<form action="./AdminAssignsRoleServlet" method="post"> 
	
	
	    <div>
		<h1>Role Assignment by Administrator Form</h1> 		
		
		</div>		
		<br/> 
	
	
	    <div>
		<p>Enter User Name of the user:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="userName"/> 
		</div>
		<br/>
		
		
		
		<div>			
		<p>Enter Role:</p> 				
		</div>		
		
		<div>		
		<input type="text" name="userRole"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateAssignRoleServlet" value="Assign-Role-To-User"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>