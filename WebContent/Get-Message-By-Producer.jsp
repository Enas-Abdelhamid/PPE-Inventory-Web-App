<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Message By Producer</title>
</head>
<body>

<form action="./MessageQueryByProducerServlet" method="post"> 
	
	
		
		
		
		<div>			
		<p>Last Name of Producer to Search with:</p> 				
		</div>		
		
		<div>		
		<input type="text" name="producerName"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateMessageQueryByProducer" value="Get-All-Messages-By-This-Producer"/>
		</div>
		<br/><br/><br/>
		
	</form> 

</body>
</html>