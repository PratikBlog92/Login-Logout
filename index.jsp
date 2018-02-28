<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login And Logout</title>
</head>
<body>
		<h1>Login form</h1>
		
		<form action="/LoginANDLogout/login">
				<label>User Name</label>
				<input type="text" name="uname"><br>
				
				<label>Password</label>
				<input type="password" name="pass"><br>
				<input type="submit" value="Login"> 
		</form>
</body>
</html>