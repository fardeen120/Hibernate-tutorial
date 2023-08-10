package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExample {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question q = new Question();
		q.setQuestionid(444);
		q.setQuestion("What is  cascading");
		
		Answer a=new Answer(555,"It is a important concept in java");
		Answer a1=new Answer(666, "It is used to save all data at once");
		Answer a2=new Answer(777, "No need to used session.save multiple times");
		
		List<Answer>list=new ArrayList<Answer>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		q.setAnswer(list);
		
		
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(q);
		
		tx.commit();
		s.close();
		factory.close();
		
		
		
		

	}

}
