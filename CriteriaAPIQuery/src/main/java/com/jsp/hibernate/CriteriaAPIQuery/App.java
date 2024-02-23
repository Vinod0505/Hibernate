package com.jsp.hibernate.CriteriaAPIQuery;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
	public static void main( String[] args )
	{
		
		User user = new User();
		user.setUserId(101);
		user.setUserName("Uday");
		user.setUserLocation("Bengaluru");
		user.setUserEmail("uday@gmail.com");
		
		User user1 = new User();
		user1.setUserId(102);
		user1.setUserName("Umar");
		user1.setUserLocation("Tamilnadu");
		user1.setUserEmail("umar@gmail.com");
		

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(user);
		session.save(user1);
		
//select userName from user where userId = (select max(userId) from user);
		
		CriteriaBuilder criteriaBuilder= session.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
//		criteriaQuery.select(root.get("userId").equals(User.class)).where(criteriaBuilder.max(root.get("userId")));
		
		
		
		

		transaction.commit();
		session.close();





	}
}
