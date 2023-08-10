package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student student1 = new  Student();
		student1.setId(100);
		student1.setName("fardeen");
		student1.setCity("kanpur");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Core java");
		certificate.setDuration("2 months");
		student1.setCerti(certificate);
		
		Student student2 = new  Student();
		student2.setId(101);
		student2.setName("rakshanda");
		student2.setCity("pune");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("python");
		certificate1.setDuration("1 months");
		student2.setCerti(certificate1);
		
		 Session session=factory.openSession();
	     Transaction txn=session.beginTransaction();
	     session.save(student1);
	     session.save(student2);
	     
	     txn.commit();
	     session.close();
	     factory.close();

	}

}
