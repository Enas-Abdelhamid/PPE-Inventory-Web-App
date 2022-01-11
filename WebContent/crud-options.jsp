<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crud Options</title>
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
h2 {
  color:blue ;
  font-family: courier;
  font-size: 80%;
}
</style>
</head>
<body>
<form action="./AuthenticationFilter" method="post"> 
	
	
	    <div>
		<h1>Authorization Level Checker:</h1> 
		<h2>Warehouse Manager: Create, Read, Update, Delete</h2> 
		<h2>Procurement Officer: Read, Update</h2> 
		<h2>HSE (Health, Safety & Environment Officer): Read</h2> 		
		</div>		
		<br/> 
	
	
	    
		
		
		
		<div>		
		<input type="submit" name="activateCrudServlet" value="Check Assigned Privileges"/>
		</div>
		<br/> 
		
Role assigned by Admin is : <input type="text" value="${defineRole}" name="role">
		
	</form> 

</body>
</html>