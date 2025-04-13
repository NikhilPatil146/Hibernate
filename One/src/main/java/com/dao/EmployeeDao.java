package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.bean.EmployeeInfo;
import com.util.EmpUtil;

public class EmployeeDao {

	public static void insertEmployeePersonalInfo(EmployeeInfo e)
	 {
		 Session session =EmpUtil.createConncextion();
		 Transaction tr=session.beginTransaction();
		 session.saveOrUpdate(e);
		 tr.commit();
		 session.close();
	 }
	 
	 public static void insertEmployee(Employee e)
	 {
		 Session session =EmpUtil.createConncextion();
		 Transaction tr=session.beginTransaction();
		 session.saveOrUpdate(e);
		 tr.commit();
		 session.close();
	 }
	 public static List<Employee> getAllEmployee()
	 {
		 Session session =EmpUtil.createConncextion();
		 List<Employee> list=session.createQuery("from Employee").list();
		 session.close();
		 return list;
	 }
	 public static Employee getEmployee(int eid)
	 {
		 Session session =EmpUtil.createConncextion();
		 Employee e=session.get(Employee.class,eid);
		 session.clear();
		 return e;
	 }
	 public static void deleteEmployee(int eid)
	 {
		 Session session =EmpUtil.createConncextion();
		 Transaction tr=session.beginTransaction();
		 Employee e=session.get(Employee.class,eid);
		 session.delete(e);
		 tr.commit();
		 session.close();
	 }

}
