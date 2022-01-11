<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recover Password</title>
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


	
	<form action="./RecoverPassServlet" method="post"> 
	
	<div>
		<h1>Enter your user Name that you registered with:</h1> 		
		</div>		
		<br/> 
		
		
	    
	
	    		
		<div>
		<input type="text" name="userName"/> 
			 
		</div>
		<br/>
		
		<div>		
		<input type="submit" name="activateSecurity" value="Ask me the Security Question"/>
		</div>
		
		<br/><br/><br/>
		
		
		
		
			
				
	</form> 
	
</body>
</html>
