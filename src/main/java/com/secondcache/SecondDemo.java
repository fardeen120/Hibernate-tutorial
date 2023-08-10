package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Question;
import com.tut.Student;

public class SecondDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session s1 =factory.openSession();
		
		Student st = s1.get(Student.class, 101);
		System.out.println(st);
		
		s1.close();
		
		Session s2=factory.openSession();
		
		Student st1 = s2.get(Student.class, 101);
		System.out.println(st1);
		
		s2.close();
		
		
		
		
		

	}

}
