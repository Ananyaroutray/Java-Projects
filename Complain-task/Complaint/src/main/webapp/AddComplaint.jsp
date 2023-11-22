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
<style>
  form {
    width: 400px;
    margin: 0 auto;
    padding: 20px;
    background-color: #92c043;
    border: 3px solid #90c087;
  }

  th {
    text-align: left;
    padding: 10px;
  }

  td {
    padding: 10px;
  }

  input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    border: none;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    cursor: pointer;
    transition: background-color 0.3s ease; /* Smooth hover effect */
  }

  input[type="submit"]:hover {
    background-color: #45a042;
  }

  a {
    text-decoration: none;
    color: #333;
  }

  a:hover {
    text-decoration: underline;
  }
</style>

<body>
     
       <form>
       <table align="center">
       <tr>
       <th>Enter the Complaint Type </th>
       <td><input type="text" name="ctype" ></td>
       </tr>
       <tr>
       <th>Enter the Complaint Description</th>
       <td><input type="text" name="cdesc"></td>
       </tr>
       <tr>
       <th>Enter the Severity</th>
       <td><input type="text" name="sev"></td>
       </tr>
       <tr><th colspan="2">
       <input type="submit" action="Add"/>
       </th></tr>
       </table>
       </form>
       <%
       Complaint complaint= new Complaint();
       complaint.setComplaintType(request.getParameter("ctype"));
       complaint.setcDescription(request.getParameter("cdesc"));
       complaint.setSeverity(request.getParameter("sev"));
       ComplaintDAO dao=new ComplainDAOImpl();
       dao.addComplaint(complaint);
       %>
       <table  align="center">
        <tr>
        <th><a href="ShowComplaint.jsp">Show All Complaint</a></th>
        </tr>
        </table>
 
   </body>
</html>