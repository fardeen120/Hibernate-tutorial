package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
//		many to many demo
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Emp e=new Emp();
		Emp e1=new Emp();
		Emp e2=new Emp();
		Project p=new Project();
		Project p1=new Project();
		Project p2=new Project();
		
		e.setEmpid(1);
		e.setEmpname("fardeen");
		
		e1.setEmpid(2);
		e1.setEmpname("rakshanda");
		
		e2.setEmpid(3);
		e2.setEmpname("pranjal");
		
		p.setPid(4);
		p.setProjname("Library management system");
		
		p1.setPid(5);
		p1.setProjname("Cafe management system");
		
		p2.setPid(6);
		p2.setProjname("Store management system");
		
		List<Emp>list=new ArrayList<Emp>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		
		List<Project>list1=new ArrayList<Project>();
		list1.add(p);
		list1.add(p1);
		list1.add(p2);
		
		e1.setProject(list1);
		e2.setProject(list1);
		p.setEmployee(list);
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(p);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		factory.close();
	}

}
