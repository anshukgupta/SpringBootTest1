<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<form action="updateMaster" method="post">
<pre>
Scheduler Id:<input type="text" name="schedulerId" value="${master.schedulerId}" readonly="readonly"/>
Start Date:<input type="text" name="startDate" value="${master.startDate}"/>
End Date:<input type="text" name="endDate" value="${master.endDate}"/>
Start Time:<input type="text" name="startTime" value="${master.startTime}"/>
Failure StartTime:<input type="text" name="failureStartTime" value="${master.failureStartTime}"/>
Notification Frequency:<input type="text" name="notificationFrequency" value="${master.notificationFrequency}"/>
Delta Days:<input type="text" name="deltaDays" value="${master.deltaDays}"/>
Mail To:<input type="text" name="mailTo" value="${master.mailTo}"/>
Mail Cc:<input type="text" name="mailCc" value="${master.mailCc}"/>
Created Time:<input type="text" name="createdTime" value="${master.createdTime}"/>
Modified Time:<input type="text" name="modifiedTime" value="${master.modifiedTime}"/>
Created By:<input type="text" name="createdBy" value="${master.createdBy}"/>
Modified By:<input type="text" name="modifiedBy" value="${master.modifiedBy}"/>
<input type="submit" value="save">
</pre>
</form>
</body>
</html>