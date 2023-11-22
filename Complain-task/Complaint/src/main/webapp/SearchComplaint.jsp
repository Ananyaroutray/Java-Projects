<%@page import="com.java.Complaint.ComplainDAOImpl"%>
<%@page import="com.java.Complaint.ComplaintDAO"%>
<%@page import="com.java.Complaint.Complaint"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

       <center>
        <form>
        <table>
        <tr>
        <th>Enter the Complaint Id</th>
        <td><input type="text" name="compId"/></td>
        <td><input type="submit" value="show"></td>
        </tr>
        </table>
        </form>
       </center>
       <hr/><hr/>
        <%
        String compId=request.getParameter("compId");
        ComplaintDAO dao=new ComplainDAOImpl();
        Complaint complaint= dao.searchComplaint(compId);
        if(complaint!=null){
        %>
        <table border="3px" bgcolor="purple" align="center">
        <tr>
        <th>Complaint Id</th>
         <th>Complaint Type</th>
         <th>Complaint Description</th>
         <th>Complaint Date</th>
         <th>Severity</th>
         <th>Status</th>
        </tr>
        <tr>
        <td><%= complaint.getComplaintId() %></td>
         <td><%= complaint.getComplaintType() %></td>
         <td><%= complaint.getcDescription() %></td>
         <td><%= complaint.getCompalintDate() %></td>
         <td><%= complaint.getSeverity() %></td>
         <td><%= complaint.getStatus() %></td>
         </tr>
        </tr>
        </table>
       
       <%
        }
       %>
        <hr/><hr/>
        <table border="3px" bgcolor="purple" align="center">
        <tr>
        <th><a href="ShowComplaint.jsp"/>Back</th>
        </tr>
        </table>
</body>
</html>