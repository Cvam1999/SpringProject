package com.map;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args)  {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("what is python?");
		Answer ans = new Answer();
		ans.setAnswerId(343);
		ans.setAnswer("java is programming language");

		q1.setAnswer(ans);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(ans); 
		tx.commit();
		s.close();
		factory.close();
	}
}
