<%@page import="com.java.Complaint.ResolveDAOImpl"%>
<%@page import="com.java.Complaint.ResolveDAO"%>
<%@page import="com.java.Complaint.Resolve"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <form action="submit_complaint.php" method="POST">
        <table>
            <tr>
                <td><label for="complaintId">Complaint ID:</label></td>
                <td><input type="text" id="complaintId" name="complaintId" required></td>
            </tr>
            <tr>
                <td><label for="resolvedBy">Resolved By:</label></td>
                <td><input type="text" id="resolvedBy" name="resolvedBy" required></td>
            </tr>
            <tr>
                <td><label for="comment">Comment:</label></td>
                <td><textarea id="comment" name="comment" rows="4" cols="50" required></textarea></td>
            </tr>
        </table>

        <br>
        <input type="submit" value="Submit">
    </form>
    <%
    String complaintId=request.getParameter("complaintId");
    String resolvedby=request.getParameter("resolvedBy");
    String comment=request.getParameter("comment");
    Resolve resolve= new Resolve();
    resolve.setComplaintId(complaintId);
    resolve.setResolvedBy(resolvedby);
    resolve.setComment(comment);
    ResolveDAO dao=new ResolveDAOImpl();
    out.println(dao.AddResolve(resolve));
    %>
</body>
</html>