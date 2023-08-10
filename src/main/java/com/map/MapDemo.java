package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		
//		one  to many
//		Question q=new Question();
//		q.setQuestionid(1212);
//		q.setQuestion("What is java");
//		
//		Answer answer=new Answer();
//		answer.setAnswerid(2332);
//		answer.setAnswer("Java is a programming language");
//		answer.setQuestion(q);
//		
//		Answer answer1=new Answer();
//		answer1.setAnswerid(2334);
//		answer1.setAnswer("Java is used to create softwares");
//		answer1.setQuestion(q);
//		
//		Answer answer2=new Answer();
//		answer2.setAnswerid(2336);
//		answer2.setAnswer("Java has many frameworks");
//		answer2.setQuestion(q);
//		
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(answer);
//		list.add(answer1);
//		list.add(answer2);
//		q.setAnswer(list);
		
		
//		one to one
//		Answer answer=new Answer();
//		answer.setAnswerid(2134);
//		answer.setAnswer("Java is a programming language");
//		q.setAnswer(answer);
//		answer.setQuestion(q);
		
//		Question q1=new Question();
//		q1.setQuestionid(2002);
//		q1.setQuestion("What is eclipse");
		
		
//		Answer answer1=new Answer();
//		answer1.setAnswerid(3443);
//		answer1.setAnswer("ide to write code");
//		q1.setAnswer(answer1);
//		answer1.setQuestion(q1);
		
//		Session session = factory.openSession();
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Question q = (Question)session.get(Question.class, 1212);
		System.out.println("id is " + q.getQuestionid());
		System.out.println("question is " +q.getQuestion());
		System.out.println("size is " + q.getAnswer().size());
		

		
//		Question qnew = (Question)session.get(Question.class, 1212);
//		System.out.println(qnew.getQuestionid());
//		System.out.println(qnew.getQuestion());
//		System.out.println(qnew.getAnswer().size());
//		session.save(q);
//		session.save(answer);
//		session.save(answer1);
//		session.save(answer2);
		
		
//		session.save(q1);
//		session.save(answer);
//		session.save(answer1);
//		
		tx.commit();
		session.close();
		factory.close();

	}

}
