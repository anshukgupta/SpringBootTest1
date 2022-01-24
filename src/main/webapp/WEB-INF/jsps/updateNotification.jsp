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
<form action="updateNotification" method="post">
<pre>
Notification Id:<input type="text" name="id" value="${notification.id}" readonly="readonly"/>
Notification EmailStatus:<input type="text" name="emailStatus" value="${notification.emailStatus}"/>
Notification SmsStatus:<input type="text" name="smsStatus" value="${notification.smsStatus}"/>
<input type="submit" value="save">
</pre>
</form>
</body>
</html>