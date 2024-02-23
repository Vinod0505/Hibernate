package com.jsp.test;

import java.util.List; 

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MobileTest {
	public static void main(String[] args) {

		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Mobile.class);
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session1 = sessionFactory.openSession();
		Transaction transaction = session1.beginTransaction();
		
		Mobile mobile1 = session1.get(Mobile.class, 1234);
//		Mobile mobile2 = session1.get(Mobile.class,2343);
		System.out.println(mobile1);
//		System.out.println(mobile2);
		transaction.commit();
		session1.close();
		
		
		Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();
		Mobile mobile3 = session2.get(Mobile.class, 1234);
//		Mobile mobile4 = session2.get(Mobile.class,2343);
		System.out.println(mobile3);
//		System.out.println(mobile4);
		
		//orderBy
//		CriteriaBuilder criteriaBuilder = session1.getCriteriaBuilder();
//		CriteriaQuery<Mobile> criteriaQuery = criteriaBuilder.createQuery(Mobile.class);
//		Root<Mobile> root = criteriaQuery.from(Mobile.class);
//		
//		CriteriaQuery<Mobile> orderBy = criteriaQuery.orderBy(criteriaBuilder.asc(root));
//		criteriaQuery.select(root);
//
//
//		List<Mobile> list = session1.createQuery(criteriaQuery).getResultList();
//		for(Mobile m : list) {
//			System.out.println(m);
//		}
		transaction2.commit();
		session2.close();
		
		
	}

}
