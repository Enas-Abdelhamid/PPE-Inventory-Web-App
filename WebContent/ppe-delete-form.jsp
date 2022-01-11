<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PPE Delete Form</title>
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
<form action="./PpeDeleteServlet" method="post"> 
	
	
	    <div>
		<h1>PPE Delete Item Form</h1> 		
		
		</div>		
		<br/> 
	
	
	    <div>
		<p>Enter Name of the Item to be deleted:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="ppeName"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateDeleteServlet" value="Delete-Exsisting-Item"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>