package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		student stu1=new student();
		stu1.setId(14134);
		stu1.setName("Shivam Gupta");
		stu1.setCity("fzd");
		Certificate certificate=new Certificate();
		certificate.setCourse("java");
		certificate.setDuration("2 month");
		
		
		
		stu1.setCerti(certificate);
		student stu2=new student();
		stu2.setId(14135);
		stu2.setName("Shivam");
		stu2.setCity("AGRA");
		Certificate certificate1=new Certificate();
		certificate1.setCourse("jpa");
		certificate1.setDuration("1 month");
		stu2.setCerti(certificate1);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(stu1);
		s.save(stu2);
		
		tx.commit();
		s.close();
		factory.close();
	}

}
