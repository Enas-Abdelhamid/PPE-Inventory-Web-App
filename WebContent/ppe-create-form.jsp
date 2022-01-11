<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PPE Create Form</title>
<style>
body {background-color: yellow;}
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
<form action="./PpeCreateServlet" method="post"> 	
	
	    <div>
		<h1>PPE Create New Item Form</h1> 		
		
		</div>		
		<br/> 
	
	
	    <div>
		<p>PPE Item S/N:</p> 		
		<p>PPE Item Name:</p> 		
		</div>		
		
		
		<div>
		<input type="text" name="ppeSN"/> 
		<input type="text" name="ppeName"/> 
		</div>
		<br/>
		
		<div>
		<p>PPE Item Brand:</p> 		
		<p>PPE Item Supplier:</p> 				
		</div>		
		
		
		<div>
		<input type="text" name="ppeBrand"/> 
		<input type="text" name="ppeSupplier"/> 
		</div>
		<br/>
		
		<div>
		<p>PPE Item Warehouse Location:</p> 		
		<p>PPE Item Quantity:</p> 				
		</div>		
		
		<div>
		<input type="text" name="ppeLocation"/> 
		<input type="text" name="ppeQuantity"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateCreateServlet" value="Create-New-Item"/>
		</div>
		<br/><br/><br/>
		
	</form> 
</body>
</html>