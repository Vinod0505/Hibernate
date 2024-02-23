package com.jsp.hibernate.MavenProject2.User;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class FetchUser {

	public static void main(String[] args) {

		//		User user = new User();
		//		user.setUserId(69);
		//		user.setUserFirstName("Jhonny");
		//		user.setUserLastName("Sins");
		//
		//		User user2 = new User();
		//
		//		user2.setUserId(70);
		//		user2.setUserFirstName("Dannie");
		//		user2.setUserLastName("Danials");
		//
		//		User user3= new User();
		//		user3.setUserId(71);
		//		user3.setUserFirstName("Mia");
		//		user3.setUserLastName("Malkova");
		//
		//		User user4 = new User();
		//		user4.setUserId(72);
		//		user4.setUserFirstName("Step");
		//		user4.setUserLastName("Mom");
		//
		//
		//
		//		User user5 = new User();
		//		user5.setUserId(73);
		//		user5.setUserFirstName("Anju");
		//		user5.setUserLastName("Gunju");



		SessionFactory sf = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		//		session.save(user);
		//		session.save(user2);
		//		session.save(user3);
		//		session.save(user4);
		//		session.save(user5);

		NativeQuery nativeQuery = session.createNativeQuery("select userFirstName from user where userId=(select max(userId) from user)");
		List<String> list = nativeQuery.list();

		for(String u : list) {
			System.out.println(u);
		}

		trans.commit();
		session.close();
	}
}
