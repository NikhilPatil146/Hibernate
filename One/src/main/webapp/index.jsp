<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="EmployeeController">
  <table cellpadding="10px">
     <tr>
     <td>First Name</td>
     <td><input type="text" name="fname"></td>
     </tr>
     <tr>
     <td>Last Name</td>
     <td><input type="text" name="lname"></td>
     </tr>
     <tr>
     <td>Email</td>
     <td><input type="text" name="email"></td>
     </tr>
     <tr>
     <td>Mobile</td>
     <td><input type="text" name="mobile"></td>
     </tr>
      <tr>
     <td>Department No</td>
     <td><input type="text" name="deptno"></td>
     </tr>
          <tr>
     <td>Job</td>
     <td><input type="text" name="job"></td>
     </tr>     <tr>
     <td>Salary</td>
     <td><input type="text" name="salary"></td>
     </tr>    
     <tr>
     <td colspan="2" align="center">
     <input type="submit" name="action" value="INSERT">
     </td>
     </tr>
  </table>
 </form>
<a href="show.jsp">All Employee</a>
</body>
</html>