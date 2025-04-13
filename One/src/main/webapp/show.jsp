
<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
 <table border="1" cellpadding="10px" cellspacing="10px" width="100%">
   <tr>
   <th>EPID</th>
   <th>FIRST NAME</th>
   <th>LAST NAME</th>
   <th>EMAIL</th>
   <th>MOBILE</th>
   <th>EID</th>
   <th>DEPTNO</th>
   <th>JOB</th>
   <th>SALARY</th>
   <th>EDIT</th>
   <th>DELETE</th>
   </tr>
   <%
    List<Employee> list=EmployeeDao.getAllEmployee();
    for(Employee e:list)
   {
   %>
   <tr>
   <td><%=e.getEinfo().getEpid() %></td>
   <td><%=e.getEinfo().getFname()%></td>
   <td><%=e.getEinfo().getLname()%></td>
   <td><%=e.getEinfo().getEmail()%></td>
   <td><%=e.getEinfo().getMobile()%></td>
   <td><%=e.getEid()%></td>
   <td><%=e.getDeptno()%></td>
   <td><%=e.getJob()%></td>
   <td><%=e.getSalary()%></td>
   <td>
   <form name="edit" method="post" action="EmployeeController">
   <input type="hidden" name="eid" value="<%=e.getEid()%>">
   <input type="submit" name="action" value="EDIT" class="btn btn-primary">
   </form>
   </td>
      <td>
   <form name="delete" method="post" action="EmployeeController">
   <input type="hidden" name="eid" value="<%=e.getEid()%>">
   <input type="submit" name="action" value="DELETE" class="btn btn-danger">
   </form>
   </td>
   </tr>
   <%
   }
   %>
 </table>
 <a href="index.jsp">Add New Student</a>
</body>
</html>