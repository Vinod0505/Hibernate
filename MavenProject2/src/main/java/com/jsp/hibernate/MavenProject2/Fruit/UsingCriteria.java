package com.jsp.hibernate.MavenProject2.Fruit;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class UsingCriteria {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Fruits.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		//		
		//		Criteria criteria = session.createCriteria(Fruits.class);
		//		List<Fruits> list = criteria.list();
		//		
		//		for(Fruits f : list) {
		//			System.out.println(f);
		//		}
		//	


		//select * from fruits where fruitId=1
		//		Criteria criteria = session.createCriteria(Fruits.class).add(Restrictions.eq("fruitId", 1));
		//
		//		Fruits uniqueResult = (Fruits)criteria.uniqueResult();
		//		System.out.println(uniqueResult);

		//selct * from fruits where fruitName like %an%
		//		Criteria criteria = session.createCriteria(Fruits.class).add(Restrictions.like("fruitName", "%an%"));
		//		List<Fruits> list = criteria.list();
		//
		//		for(Fruits f : list) {
		//			System.out.println(f);
		//		}


		//select * from fruits where fruitName not like "ap"
		Criteria criteria = session.createCriteria(Fruits.class)
									.add(Restrictions.not(Restrictions.like("fruitName", "%app%")));
		List<Fruits> list = criteria.list();

		for(Fruits f : list) {
			System.out.println(f);
		}

		trans.commit();
		session.close();
	}
}
