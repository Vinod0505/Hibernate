package com.jsp.hibernate.MyFIrstHibProject.House_Owner;

import java.util.Arrays; 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingOH {

	public static void main(String[] args) {

		Configuration cfg =new Configuration().configure()
				.addAnnotatedClass(Owner.class).addAnnotatedClass(House.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		House house = session.get(House.class,1001);
		House house2 = session.load(House.class, 103);

		System.out.println(house);
		System.out.println(house2);

		trans.commit();
		session.close();


	}
}
