package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;
import com.bean.EmployeeInfo;

public class EmpUtil {

	public static Session createConncextion()
	{
	Session session=null;
	SessionFactory sf=new Configuration()
			.addAnnotatedClass(Employee.class)
			.addAnnotatedClass(EmployeeInfo.class)
			.configure()
			.buildSessionFactory();
	session=sf.openSession();
	return session;
}

}
