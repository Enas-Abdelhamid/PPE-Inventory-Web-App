<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crud Options Authorized</title>
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
<form action="./CrudServlet" method="post"> 
	
	
	    <div>
		<h1>The Admin assigned you the role of Warehouse Manager, you can CREATE, READ, UPDATE & DELETE PPE data:</h1> 		
		</div>		
		<br/> 
	
	
	    
		
		<div>		
		<input type="submit" name="activateCrudServlet" value="Create New PPE Item"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServlet" value="Read All PPE Items"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServlet" value="Update A PPE Item"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServlet" value="Delete A PPE Item"/>
		</div>
		<br/> 
		

		
	</form> 

</body>
</html>