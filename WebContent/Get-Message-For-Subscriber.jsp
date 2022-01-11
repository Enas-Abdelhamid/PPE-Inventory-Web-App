<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Message For Subscriber</title>
</head>
<body>

<form action="./MessageQueryBySubscriberServlet" method="post"> 
	
	
		
		
		
		<div>			
		<p>Last Name of Subscriber to Search with:</p> 				
		</div>		
		
		<div>		
		<input type="text" name="subscriberName"/> 
		</div>
		<br/><br/>
		
		<div>		
		<input type="submit" name="activateMessageQueryBySubscriber" value="Get-All-Messages-This-Subscriber-Can-See"/>
		</div>
		<br/><br/><br/>
		
	</form> 

</body>
</html>