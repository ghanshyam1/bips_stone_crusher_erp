<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.bips.minning.beans.MinningBean" %>
   
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
<body>


<% List<MinningBean> record = (List)request.getAttribute("record");%>


<table class="table" style="width:70%;margin-left:200px">
<tr>

<td><label>NO OF HOLES</label></td>
<td><label>FEET<label></td>
<td><label>RATE</label></td>
<td><label>DATE</label></td>
<td><label>TOTAL FEET</label></td>
<td><label>TOTAL RS</label></td>

</tr>

<% for(int i = 0; i < record.size(); i++) { %>

<tr class="success"><td><%=record.get(0).getNoOfHoles() %></td>

<td><%=record.get(i).getFeet() %></td>
<td><%=record.get(i).getOnefeetrate() %></td>
<td><%=record.get(i).getDate() %></td>
<td><%=record.get(i).getTotalfeet()%></td>
<td><%=record.get(i).getTotal() %></td>

</tr>
 <% } %>
 
</table>
<table class="table" style="width:75%;margin-left:135px">
<tr class="info" ><td><label>Total</label></td></tr>

</table>
</body>
</html>