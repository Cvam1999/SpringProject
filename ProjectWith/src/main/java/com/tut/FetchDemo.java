package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class FetchDemo {

	public static void main(String[] args) {
		//get  load
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		student stu=(student)session.get(student.class,104);
		System.out.println(stu);
		Address ad=(Address)session.load(Address.class, 3);
		System.out.println(ad.getStreet());
		session.close();
		factory.close();

	}

}
