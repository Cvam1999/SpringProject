package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        	try {
        		System.out.println( "projected started.." );
        	      Configuration cfg=new Configuration();
        	      cfg.configure("hibernate.cfg.xml");
        	        SessionFactory factory=cfg.buildSessionFactory();
        	        student st=new student();
        	        st.setId(105);
        	        st.setName("john");
        	        st.setCity("kanpur");
        	        System.out.println(st);
        	        
        	        Address ad=new Address();
        	        ad.setStreet("street1");
        	        ad.setCity("delhi");
        	        ad.setOpen(true);
        	        //ad.setAddedDate(new Date());
        	        ad.setX(2132.232);
        	        FileInputStream fis=new FileInputStream("src/main/java/dog.png");
        	        byte[] data=new byte[fis.available()];
        	        fis.read(data);
        	        ad.setImage(data);
        	        
        	        Session session=factory.openSession();
        	        Transaction tx=session.beginTransaction();
        	        session.save(st);
        	        session.save(ad);
        	        tx.commit();
        	        session.close();
        	        System.out.println("Done");
        	}
        	catch(Exception e) {
        		System.out.println(e);
        	}
    
        
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
    }
}
