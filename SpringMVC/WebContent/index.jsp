<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="welcome.spring">Click Here</a><br>

<form action="store.spring" method="post">
UserName:<input type="text" name="name"><br>
Password:<input type="password" name="pass"><br>
<input type="submit" value="Submit"> 
</form>

<%
String value = (String)request.getAttribute("msg");
if(value!=null){
	out.println(value);
}
%>
<br>

<a href="loadData.spring">Display Login Data</a>
</body>
</html>




