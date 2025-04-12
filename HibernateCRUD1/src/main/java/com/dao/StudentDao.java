package com.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Student;
import com.util.StudentUtil;
import java.util.List;


public class StudentDao {

	public static void insetStudent(Student s)
	{
		Session session=StudentUtil.createSession();
        Transaction tr=session.beginTransaction();
        session.saveOrUpdate(s);
        tr.commit();
        session.close();
	}
	public static List<Student> getAllStudent()
	{
		Session session=StudentUtil.createSession();
		List<Student> list=session.createQuery("from Student").list();
		session.close();
		return list;
	}   
	public static Student getStudent(int sid)
	{
		Session session=StudentUtil.createSession();
		Student s=session.get(Student.class,sid);
		session.close();
		return s;
	}
	public static void deleteStudent(int sid)
	{
		Session session=StudentUtil.createSession();
        Transaction tr=session.beginTransaction();
        Student s=session.get(Student.class,sid);
        session.delete(s);
        tr.commit();
        session.close();
	}
}
