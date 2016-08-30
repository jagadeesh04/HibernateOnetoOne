package com.jag.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		
		Student student = new Student();
		StudentDetail studentDetail= new StudentDetail(); 
		student.setStudent_name("jag");
		
		studentDetail.setStudent_mobile_number("919-633-9534");
		
		studentDetail.setStudent(student);
		

		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		//session.save(student);
		session.save(studentDetail);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
		
		
	}

}
