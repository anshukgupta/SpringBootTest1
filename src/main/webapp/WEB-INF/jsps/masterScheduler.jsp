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
<h2>Master Scheduler</h2>
<table border="1" style="width: 100%">
<tbody>
<tr>
<th>SchedulerId</th>
<th width="50%">StartDate</th>
<th width="50%">EndDate</th>
<th>StartTime</th>
<th>FailureStartTime</th>
<th>NotificationFrequency</th>
<th>DeltaDays</th>
<th>MailTo</th>
<th>MailCc</th>
<th>CreatedTime</th>
<th>ModifiedTime</th>
<th>CreatedBy</th>
<th>ModifiedBy</th>
</tr>

<c:forEach items="${master}" var="mas">
<tr>
<td>${mas.schedulerId}</td>
<td>${mas.startDate}</td>
<td>${mas.endDate}</td>
<td>${mas.startTime}</td>
<td>${mas.failureStartTime}</td>
<td>${mas.notificationFrequency}</td>
<td>${mas.deltaDays}</td>
<td>${mas.mailTo}</td>
<td>${mas.mailCc}</td>
<td>${mas.createdTime}</td>
<td>${mas.modifiedTime}</td>
<td>${mas.createdBy}</td>
<td>${mas.modifiedBy}</td>
<td><a href="showUpdate?schedulerId=${mas.schedulerId}">update</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>