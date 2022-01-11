<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Security Check</title>
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


	
	<form action="./GivePassServlet" method="post"> 
	
	<div>
		<h1>Answer the hereunder security question with the same answer you registered with:</h1> 		
		</div>		
		<br/> 
		
		
	    <div>
		<input type="text" value="${quest}" name="questval">
			 
		</div>
		<br/>
		
			
	    		
		<div>
		<input type="text" name="answer"/> 
		
			 
		</div>
		<br/>
		
		<div>
		<h1>Your user name again:</h1> 		
		</div>		
		 
		
		<div>
		
		<input type="text" name="nameval">
			 
		</div>
		<br/>
		
		<div>		
		<input type="submit" name="activateGivePass" value="Send-Me-My-Password"/>
		</div>
		
		<div>
		<input type="hidden" value="${ans}" name="answerval">
		
			 
		</div>
		<br/>
		
		<br/><br/><br/>
		
		
		
		
			
				
	</form> 
	
</body>
</html>
