package com.controller;

import java.io.IOException;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.dao.StudentDao;

@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action =request.getParameter("action");
	
	if(action.equalsIgnoreCase("insert"))
	{
		Student s=new Student();
		s.setFname(request.getParameter("fname"));
		s.setLname(request.getParameter("lname"));
		s.setEmail(request.getParameter("email"));
		s.setMobile(request.getParameter("mobile"));
		StudentDao.insetStudent(s);
		response.sendRedirect("show.jsp");
	}
	else if(action.equalsIgnoreCase("edit"))
	{
		int sid=Integer.parseInt(request.getParameter("sid"));
		Student s=StudentDao.getStudent(sid);
		request.setAttribute("s", s);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}
	else if(action.equalsIgnoreCase("update"))
	{
		Student s=new Student();
		s.setSid(Integer.parseInt(request.getParameter("sid")));
		s.setFname(request.getParameter("fname"));
		s.setLname(request.getParameter("lname"));
		s.setEmail(request.getParameter("email"));
		s.setMobile(request.getParameter("mobile"));
		StudentDao.insetStudent(s);
		response.sendRedirect("show.jsp");

	}
	else if(action.equalsIgnoreCase("delete"))
	{
		int sid=Integer.parseInt(request.getParameter("sid"));
         StudentDao.deleteStudent(sid);
 		response.sendRedirect("show.jsp");

	}
	
	}

}
