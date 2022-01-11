<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN CRUD ALL</title>
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
<form action="./AdminCrudUserServlet" method="post"> 
	
	
	<div>
		<h1>Accounts Control - Choose which task you want to perform:</h1> 		
		</div>		
		<br/> 
	
	
	    
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Change my Admin Password"/>
		<input type="submit" name="activateCrudServletadmin" value="Log-Out"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Read All User Accounts"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Update A User Account"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Delete A User Account"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Assign Role to a User"/>
		</div>
		<br/> 
	
	    <div>
		<h1>PPE Records Control - Choose which task you want to perform:</h1> 		
		</div>		
		<br/> 
	
	
	    
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Create New PPE Item"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Read All PPE Items"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Update A PPE Item"/>
		</div>
		<br/> 
		
		<div>		
		<input type="submit" name="activateCrudServletadmin" value="Delete A PPE Item"/>
		</div>
		<br/> 
		
	</form> 

</body>
</html>