<%@page import="com.bean.Employee"%>
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
   Employee e=(Employee)request.getAttribute("e");
%>
<form name="frm" method="post" action="EmployeeController">
  <table cellpadding="10px">
     <tr>
     <td><input type="hidden" name="eid" value="<%=e.getEid()%>"></td>
      <td><input type="hidden" name="epid" value="<%=e.getEinfo().getEpid()%>"></td>
     </tr>
     <tr>
     <td>First Name</td>
     <td><input type="text" name="fname" value="<%=e.getEinfo().getFname()%>"></td>
     </tr>
     <tr>
     <td>Last Name</td>
     <td><input type="text" name="lname" value="<%=e.getEinfo().getLname()%>"></td>
     </tr>
     <tr>
     <td>Email</td>
     <td><input type="text" name="email" value="<%=e.getEinfo().getEmail()%>"></td>
     </tr>
     <tr>
     <td>Mobile</td>
     <td><input type="text" name="mobile" value="<%=e.getEinfo().getMobile()%>"></td>
     </tr>
      <tr>
     <td>Department No</td>
     <td><input type="text" name="deptno" value="<%=e.getDeptno()%>"></td>
     </tr>
          <tr>
     <td>Job</td>
     <td><input type="text" name="job" value="<%=e.getJob()%>"></td>
     </tr>     <tr>
     <td>Salary</td>
     <td><input type="text" name="salary" value="<%=e.getSalary()%>"></td>
     </tr>    
     <tr>
     <td colspan="2" align="center">
     <input type="submit" name="action" value="UPDATE">
     </td>
     </tr>
  </table>
 </form>

</body>
</html>