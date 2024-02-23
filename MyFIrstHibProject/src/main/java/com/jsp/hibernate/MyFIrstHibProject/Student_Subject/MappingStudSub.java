package com.jsp.hibernate.MyFIrstHibProject.Student_Subject;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingStudSub {
	public static void main(String[] args) {

		StudentMapping sm1 = new StudentMapping();
		sm1.setStudentId(1);
		sm1.setStudentName("Ramu");

		StudentMapping sm2 = new StudentMapping();
		sm2.setStudentId(2);
		sm2.setStudentName("Lakshman");

		SubjectMapping s1 = new SubjectMapping();
		s1.setSubjectId(6001);
		s1.setSubjectName("Mathematics");
		s1.setStudentMapping(sm1);
		s1.setStudentMapping(sm2);

		SubjectMapping s2 = new SubjectMapping();
		s2.setSubjectId(6002);
		s2.setSubjectName("Physics");
		s2.setStudentMapping(sm1);
		s2.setStudentMapping(sm2);

		SubjectMapping s3 = new SubjectMapping();
		s3.setSubjectId(6003);
		s3.setSubjectName("Chemistry");
		s3.setStudentMapping(sm1);
		s3.setStudentMapping(sm2);

		SubjectMapping s4 = new SubjectMapping();
		s4.setSubjectId(6004);
		s4.setSubjectName("Biology");
		s4.setStudentMapping(sm2);

		sm1.setSubList(Arrays.asList(s1,s2,s3));


		SessionFactory sf = new Configuration().configure()
				.addAnnotatedClass(StudentMapping.class).addAnnotatedClass(SubjectMapping.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		session.save(sm1);
		session.save(sm2);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);

		trans.commit();
		session.close();

	}
}
