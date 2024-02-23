package com.jsp.hibernate.MyFIrstHibProject.Student_College;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(College.class).buildSessionFactory();
		//		cfg.configure();
		//		cfg.addAnnotatedClass(Student.class);
		//		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction trans = session.beginTransaction();

		College clg = new College();
		clg.setcollegeId(56);
		clg.setcollegeName("JNTUA");


		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Vinod");
		s1.setStudnetContactNo(9000054528L);
		s1.setStudentPercentage(89.56);
		s1.setCollege(clg);

		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("Raki");
		s2.setStudnetContactNo(9348945281L);
		s2.setStudentPercentage(79.56);

		Student s3 = new Student();
		s3.setStudentId(103);
		s3.setStudentName("Uday");
		s3.setStudnetContactNo(987654321L);
		s3.setStudentPercentage(83.96);

		List<Student> studentList= new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		session.save(clg);
		for(Student student : studentList) {
			session.save(student);
		}
		trans.commit();
		session.close();
	}

}
