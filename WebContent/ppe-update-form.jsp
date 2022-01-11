<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PPE Update Form</title>
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
<form action="./PpeUpdateServlet" method="post"> 
	
	
	    <div>
		<h1>PPE Update Item Form</h1> 		
		
		</div>		
		<br/> 
	
	
	    <div>
		<p>Enter Name of the Item to be updated:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="ppeName"/> 
		</div>
		<br/>
		
		
		
		<div>			
		<p>PPE Updated Item Quantity:</p> 				
		</div>		
		
		<div>		
		<input type="text" name="ppeQuantity"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateUpdateServlet" value="Update-Exsisting-Item"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>