<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.bips.employee.beans.EmployeeDailyExpBean" %>
   
    <%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Record</title>
</head>
<body style="background-color:orange">


<% List record = (List)request.getAttribute("record");%>


<table class="table" style="width:70%;margin-left:220px">
<tr>

<td><label>EMPLOYEE NAME</label></td>
<td><label>ADDRESS</label><label></td>
<td><label>RS</label></td>
<td><label>DATE</label></td>
<td><label>DESCRIPTION</label></td>
</tr>
<%
List<EmployeeDailyExpBean> record1=(List)record.get(0);
List record2=(List)record.get(1);
%>
<% for(int i = 0; i < record1.size(); i++) { %>

<tr class="success"><td><%=record1.get(0).getEmployee_name() %></td>

<td><%=record1.get(i).getAddress() %></td>
<td><%=record1.get(i).getRs() %></td>
<td><%=record1.get(i).getDate() %></td>
<td><%=record1.get(i).getDescription()%></td>


</tr>
 <% } %>
 
</table>
<table class="table" style="width:76.5%;margin-left:135px">
<tr class="info" ><td style="width: 555px;"><label>Total</label></td>
<td><%=record2.get(0) %></td>
</tr>
 
</table>
</body>
</html>