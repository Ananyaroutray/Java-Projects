<%@page import="java.util.List"%>
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
<script type="text/javascript">
function changeSpanColor() {
    var currentDate = new DateTime();
    var rows = document.getElementById("tables").rows;

    for (var i = 1; i < rows.length; i++) {
        var complaintDateStr = rows[i].cells[3].textContent;
        var complaintDate = new Date(complaintDateStr);

        var daysDifference = Math.ceil((complaintDate - currentDate) / (1000 * 60 * 60 * 24));
        var compColorSpan = rows[i].querySelector('.compColor');

        if (daysDifference > 7) {
            compColorSpan.style.color = 'red';
            compColorSpan.textContent = 'Pending';
        } else {
            compColorSpan.style.color = 'green';
            compColorSpan.textContent = 'Pending';
        }
    }
} 
</script>
</head>
<body>
<%
ComplaintDAO dao = new ComplainDAOImpl();
List<Complaint> compList = dao.showAllComplaint();
%>
<table id="tables" border="3px" bgcolor="purple" align="center">
    <tr>
        <th>Complaint Id</th>
        <th>Complaint Type</th>
        <th>Complaint Description</th>
        <th>Complaint Date</th>
        <th>Severity</th>
        <th>Status</th>
        <th>Priority</th>
    </tr>
    <%
    for (Complaint complaint : compList) {
    %>
    <tr>
        <td class="a"><%= complaint.getComplaintId() %></td>
        <td class="a"><%= complaint.getComplaintType() %></td>
        <td class="a"><%= complaint.getcDescription() %></td>
        <td class="a"><%= complaint.getCompalintDate() %></td>
        <td class="a"><%= complaint.getSeverity() %></td>
        <td class="a"><%= complaint.getStatus() %></td>
        <td><span class="compColor"></span></td>
        <td><th><a href="AddResolve.jsp?complaintId=<%=complaint.getComplaintId()%> & complaintDate=<%= complaint.getCompalintDate()%> ">Resolve This<a/></th></td>
    </tr>
    <% } %>
</table>
<hr/><hr/>
<table border="3px" bgcolor="" align="center">
    <tr>
        <th><a href="AddComplaint.jsp"/>Add Complaint</th>
        <th><a href="SearchComplaint.jsp"/>Search Complaint</th>
        <th><a href="ResolveData.jsp">Data Resolve</a></th>
    </tr>
</table>

<script type="text/javascript">
window.onload = function() {
    changeSpanColor();
};
</script>
</body>
</html>
