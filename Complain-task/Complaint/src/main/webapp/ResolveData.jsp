<%@page import="com.java.Complaint.Resolve"%>
<%@page import="java.util.List"%>
<%@page import="com.java.Complaint.ResolveDAOImpl"%>
<%@page import="com.java.Complaint.ResolveDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <%
      ResolveDAO dao=new ResolveDAOImpl();
      List<Resolve> resolvedList=dao.showResolvedData();
      
      %>
      <table border="3px" bgcolor="purple" align="center">
      <tr>
      <th>Resolved Id</th>
      <th>Complaint Id</th>
      <th>Complaint Date</th>
      <th>Resolved Id</th>
      <th>Resolved Date</th>
      <th>Resolved By</th>
      <th>Comments</th>
      </tr>
      <%
      for(Resolve resolve: resolvedList){
      %>
      <tr>
      <td><%=resolve.getResolveId() %></td>
      <td><%= resolve.getComplaintId() %></td>
      <td><%= resolve.getComplaintDate() %></td>
      <td><%=resolve.getResolvedDate() %></td>
      <td><%=resolve.getResolvedBy() %></td>
      <td><%=resolve.getComment() %></td>
      </tr>
      <%
      }
      %>
      
      </table>
      <hr/><hr/>
</body>
</html>