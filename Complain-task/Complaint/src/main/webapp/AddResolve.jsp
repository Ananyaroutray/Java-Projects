<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.java.Complaint.ComplainDAOImpl"%>
<%@page import="com.java.Complaint.ComplaintDAO"%>
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
    <%
    String ComplaintId = request.getParameter("complaintId");
    String complaintDateStr = request.getParameter("complaintDate");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    java.util.Date utilDate = sdf.parse(complaintDateStr);
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    %>
    <form action="submit_complaint.php" method="POST">
        <table>
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
    Resolve resolve = new Resolve();
    resolve.setComplaintId(ComplaintId);
    resolve.setComment(request.getParameter("comment"));
    resolve.setResolvedBy(request.getParameter("resolvedBy"));
    resolve.setComplaintDate(sqlDate);
    ResolveDAO dao = new ResolveDAOImpl();
    dao.AddResolve(resolve);
    ComplaintDAO dao1 = new ComplainDAOImpl();
    dao1.deleteComplaint(ComplaintId);
    %>
</body>
</html>
