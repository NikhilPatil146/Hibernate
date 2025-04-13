package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.bean.EmployeeInfo;
import com.dao.EmployeeDao;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		String action=request.getParameter("action");
	    
	     if(action.equalsIgnoreCase("insert"))
	     {
	    	 EmployeeInfo ep=new EmployeeInfo();
	    	 ep.setFname(request.getParameter("fname"));
	    	 ep.setLname(request.getParameter("lname"));
	    	 ep.setEmail(request.getParameter("email"));
	    	 ep.setMobile(request.getParameter("mobile"));
	    	 
            EmployeeDao.insertEmployeePersonalInfo(ep);
            
            Employee e =new Employee();
            e.setDeptno(Integer.parseInt(request.getParameter("deptno")));
            e.setJob(request.getParameter("job"));
            e.setSalary(Double.parseDouble(request.getParameter("salary")));
            e.setEinfo(ep);
            
            EmployeeDao.insertEmployee(e);
            
            response.sendRedirect("show.jsp");
	     }
	     else if(action.equalsIgnoreCase("edit"))
	     {
	    	 int eid=Integer.parseInt(request.getParameter("eid"));
	    	 Employee e=EmployeeDao.getEmployee(eid);
	    	 request.setAttribute("e",e);
	    	 request.getRequestDispatcher("update.jsp").forward(request, response);
	     }
	     else if(action.equalsIgnoreCase("update"))
	     {
	    	 EmployeeInfo ep=new EmployeeInfo();
	    	 ep.setEpid(Integer.parseInt(request.getParameter("epid")));
	    	 ep.setFname(request.getParameter("fname"));
	    	 ep.setLname(request.getParameter("lname"));
	    	 ep.setEmail(request.getParameter("email"));
	    	 ep.setMobile(request.getParameter("mobile"));
	    	 
            EmployeeDao.insertEmployeePersonalInfo(ep);
            
            Employee e =new Employee();
            e.setEid(Integer.parseInt(request.getParameter("eid")));
            e.setDeptno(Integer.parseInt(request.getParameter("deptno")));
            e.setJob(request.getParameter("job"));
            e.setSalary(Double.parseDouble(request.getParameter("salary")));
            e.setEinfo(ep);
            
            EmployeeDao.insertEmployee(e);
            
            response.sendRedirect("show.jsp");
	     }
	     else if(action.equalsIgnoreCase("delete"))
	     {
	    	 int eid=Integer.parseInt(request.getParameter("eid"));
             EmployeeDao.deleteEmployee(eid);
             request.getRequestDispatcher("show.jsp").forward(request, response);
	     }
	}

	
	}


