<%@page import="com.dao.StudentDao"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%" cellspacing="10px">
<tr>
<th>SID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>MOBILE</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<%
 List<Student> list=StudentDao.getAllStudent();
for(Student s:list)
{
	%>
     <tr>
     <td><%=s.getSid() %> </td>
      <td><%=s.getFname() %> </td>
     <td><%=s.getLname() %> </td>
     <td><%=s.getEmail() %> </td>
     <td><%=s.getMobile() %> </td>
     <td>
     <form name="edit" method="post" action="ActionController">
     <input type="hidden" name="sid" value="<%=s.getSid()%>">
     <input type="submit" name="action" value="EDIT">
     </form>
     </td>
     <td>
     <form name="delete" method="post" action="ActionController">
     <input type="hidden" name="sid" value="<%=s.getSid()%>">
     <input type="submit" name="action" value="DELETE">
     </form>
     </td>
     
     </tr>	
	<%
}
%>
</tr>
</table>
<a href="index.jsp">ADD To Student</a>
</body>
</html>