package com.jsp.hibernate.MyFIrstHibProject.Person_Pan;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonMain {
	public static void main(String[] args) {
		Passport pass1 = new Passport();
		pass1.setPassportId(401);
		pass1.setNameOnPassport("Lokesh");
		pass1.setLocOnPassport("Chennai");
		
		Passport pass2 = new Passport();
		pass2.setPassportId(402);
		pass2.setNameOnPassport("PAVAN");
		pass2.setLocOnPassport("Bengaluru");
		
		Passport pass3 = new Passport();
		pass3.setPassportId(401);
		pass3.setNameOnPassport("RAVAN");
		pass3.setLocOnPassport("Kerala");
			
//		Pan pan1 = new Pan();
//		pan1.setPanId(12345);
//		pan1.setNameOnPan("LOKESH");
//		pan1.setLocOnPan("UK");
//		
//		Pan pan2 = new Pan();
//		pan2.setPanId(23443);
//		pan2.setNameOnPan("PAVAN");
//		pan2.setLocOnPan("US");
//		
//		Pan pan3 = new Pan();
//		pan3.setPanId(23434);
//		pan3.setNameOnPan("RAVAN");
//		pan3.setLocOnPan("INDIA");
		
		Person p1 = new Person();
		p1.setPersonId(1);
		p1.setPersonName("PAVAN");
		p1.setPersonContact(99999999);
//		p1.setPan(pan2);
		p1.setPassport(pass2);
		
		Person p2 = new Person();
		p2.setPersonId(2);
		p2.setPersonName("LOKESH");
		p2.setPersonContact(7777779);
//		p2.setPan(pan1);
		p2.setPassport(pass1);
		
		Person p3 = new Person();
		p3.setPersonId(3);
		p3.setPersonName("RAVAN");
		p3.setPersonContact(87654468);
//		p3.setPan(pan3);
		p3.setPassport(pass3);
		
		
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class).buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction trans =session.beginTransaction();
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		
		session.save(pass1);
		session.save(pass2);
		session.save(pass3);
		
		
		for(Person person:personList) {
			session.save(person);
		}
		
		trans.commit();
		session.close();
	
		
		
		
	}
}
