
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Login"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>UserName</th>
		<th>Password</th>
	</tr>
<%
List<Login> listOfRec = (List<Login>)request.getAttribute("data");
Iterator<Login> lit = listOfRec.iterator();
while(lit.hasNext()){
	Login ll = lit.next();
	%>
		<tr>
			<td> <%=ll.getName() %></td>
			<td> <%=ll.getPass() %></td>
		</tr>
	<%
}
%>
</table>
</body>
</html>