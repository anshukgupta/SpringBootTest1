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
<h2>Sr_Surveyor_Respondent_Details</h2>
<table border="2" style="width: 100%">
<tbody>
<tr>
<th>RespdtDetailsId</th>
<th>UserId</th>
<th>FirstName</th>
<th>LastName</th>
<th>RespondentType</th>
<th>URL</th>
<th>StateId</th>
<th>CreatedTime</th>
<th>ModifiedTime</th>
<th>CreatedBy</th>
<th>ModifiedBy</th>
<th>EmailId</th>
<th>IsSurveySubmitted</th>
<th>Status</th>
<th>SurveyorMobileNumber</th>
<th>RespondentMobileNumber</th>
<th>ReminderCount</th>
<th>ReminderFailureTime</th>
</tr>

<c:forEach items="${surveyorRespondent}" var="res">
<tr>
<td>${res.respdtDetailsId}</td>
<td>${res.userId}</td>
<td>${res.firstName}</td>
<td>${res.lastName}</td>
<td>${res.respondentType}</td>
<td>${res.url}</td>
<td>${res.stateId}</td>
<td>${res.createdTime}</td>
<td>${res.modifiedTime}</td>
<td>${res.createdBy}</td>
<td>${res.modifiedBy}</td>
<td>${res.emailId}</td>
<td>${res.isSurveySubmitted}</td>
<td>${res.status}</td>
<td>${res.surveyorMobileNumber}</td>
<td>${res.respondentMobileNumber}</td>
<td>${res.reminderCount}</td>
<td>${res.reminderFailureTime}</td>
</tr>
</c:forEach>
</body>
</html>