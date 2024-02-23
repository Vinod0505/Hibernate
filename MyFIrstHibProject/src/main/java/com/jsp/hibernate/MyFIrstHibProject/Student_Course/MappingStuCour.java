package com.jsp.hibernate.MyFIrstHibProject.Student_Course;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingStuCour {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setStudentId(1001);
		s1.setStudentName("Mahesh");

		Student s2 = new Student();
		s2.setStudentId(1003);
		s2.setStudentName("Rakesh");

		Student s3 = new Student();
		s3.setStudentId(1002);
		s3.setStudentName("Uday");



		Course c1 = new Course();
		c1.setCourseId(111);
		c1.setCoursesName("Java ");
		c1.setCoursePrice(36500);

		Course c2 = new Course();
		c2.setCourseId(112);
		c2.setCoursesName("SQL");
		c2.setCoursePrice(30000);

		Course c3 = new Course();
		c3.setCourseId(113);
		c3.setCoursesName("WEB");
		c3.setCoursePrice(25000);

		s1.setcList(Arrays.asList(c1,c2));
		s2.setcList(Arrays.asList(c2,c3));
		s3.setcList(Arrays.asList(c1,c2,c3));

		c1.setsList(Arrays.asList(s1,s3));
		c2.setsList(Arrays.asList(s1,s2,s3));
		c3.setsList(Arrays.asList(s2,s3));

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(c1);
		session.save(c2);
		session.save(c3);

		trans.commit();
		session.close();


	}
}
