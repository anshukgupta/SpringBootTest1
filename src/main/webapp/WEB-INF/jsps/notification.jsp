<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Notification</h2>
<table>
<tr>
<th>Id</th>
<th>Email Status</th>
<th>Sms Status</th>
</tr>

<c:forEach items="${notification}" var="noti">
<tr>
<td>${noti.id}</td>
<td>${noti.emailStatus}</td>
<td>${noti.smsStatus}</td>
<td><a href="showNotiUpdate?id=${noti.id}">update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>