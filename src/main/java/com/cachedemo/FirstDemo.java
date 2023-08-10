package com.cachedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Question;

public class FirstDemo {

	public static void main(String[] args) {
//		first level cache by default enabled
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		
		Question ques=s.get(Question.class, 1212);
		System.out.println(ques.getQuestion());
		
		System.out.println("still working");
		
		Question ques1=s.get(Question.class, 1212);
		System.out.println(ques1.getQuestion());
		s.close();
		

	}

}
