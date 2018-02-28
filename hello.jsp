<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello</title>
</head>
<body>
<%
	if(session.getAttribute("username") != null)
	{
	
%>
	<h1>hello There</h1>
	<a href="/LoginANDLogout/logout">Logout</a>

<%

}else{
	response.sendRedirect("/LoginANDLogout/index.jsp");
}
%>
</body>
</html>