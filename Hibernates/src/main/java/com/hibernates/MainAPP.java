package com.hibernates;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainAPP {

	public static void main(String[] args)
	{
		Student sob=new Student();
		sob.setSid(3);
		sob.setSname("chaithra");
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(sob);
		tx.commit();
	

	}

}
