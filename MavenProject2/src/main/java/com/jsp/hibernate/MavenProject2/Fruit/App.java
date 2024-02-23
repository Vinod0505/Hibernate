package com.jsp.hibernate.MavenProject2.Fruit;

import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{



		//		Query<Object[]> query = session.createQuery("select fr.fruitId,fr.fruitName,fr.fruitPrice from Fruits fr");
		//
		//		List<Object[]> list = query.list();
		//		for (Object[] objects : list) {
		//			for (Object[] objects2 : list) {
		//				System.out.println(objects2);
		//			}
		//			System.out.println();
		//	}

		//		String updateQuery ="Update Fruits f set f.fruitPrice=45 where f.fruitId= 1 ";
		//		Query query = session.createQuery(updateQuery);
		//		int executeUpdate = query.executeUpdate();
		//		
		//		System.out.println(executeUpdate+" records(f) updated");


		//		NativeQuery nativeQuery = session.createNativeQuery("select * from fruits");
		//		List<Object[]> oList = nativeQuery.list();

		//		
		//		for(Object[] o : oList) {
		//			for(Object obj : o) {
		//				System.out.print(obj);
		//			}
		//			System.out.println();
		//		}


		//		for(Object[] o : oList) {
		//			System.out.println(Arrays.deepToString(o));
		//		}

		//		update query
		//		NativeQuery nativeQuery = session.createNativeQuery("update fruits set fruitPrice=108 where fruitId=2");

		//Delete query
		//		NativeQuery nativeQuery = session.createNativeQuery("Delete from fruits where fruitId=4");


		//		 insert Query

		//		NativeQuery nativeQuery = session.createNativeQuery("insert into fruits values(4,'Avacado',302)");
		//		int i = nativeQuery.executeUpdate();
		//		
		//		
		//		System.out.println(i);



		//select * from fruits


		//		criteriaQuery.select(root);

		//select * from fruits where fruitName ='DragonFruit'
		//		criteriaQuery.where(criteriaBuilder.equal( root.get("fruitName"), "Dragon"));

		//select * from fruits where fruitprice is less than 200 ruppees

		//		criteriaQuery.where(criteriaBuilder.lessThan(root.get("fruitPrice"), 200));










		//update fruits set fruitPrice=300 where fruitName=Dragon

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Fruits.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();



		//		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		//		CriteriaUpdate<Fruits> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Fruits.class);
		//
		//
		//		Root<Fruits> root = criteriaUpdate.from(Fruits.class);
		//
		//		criteriaUpdate.set(root.get("fruitPrice"), 300).where(criteriaBuilder.equal(root.get("fruitName"), "Dragon"));
		//
		//		Query query = session.createQuery(criteriaUpdate);
		//		int i = query.executeUpdate();
		//		if(i==1) {
		//			System.out.println(i+" record updated");
		//		}

		//
		//		CriteriaQuery<Fruits> criteriaQuery = criteriaBuilder.createQuery(Fruits.class);
		//
		//		Root<Fruits> root = criteriaQuery.from(Fruits.class);
		//
		//		CriteriaUpdate<Fruits> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Fruits.class);
		//		criteriaUpdate.set(root.get("fruitPrice"), 300).where(criteriaBuilder.equal(root.get("fruitName"), "Dragon"));
		//
		//
		//		Query<Fruits> query = session.createQuery(criteriaQuery);
		//		
		//		query.executeUpdate();
		//
		//		List<Fruits> list = query.getResultList();
		//
		//		for(Fruits f : list) {
		//			System.out.println(f);
		//		}

		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaDelete<Fruits> criteriaDelete = criteriaBuilder.createCriteriaDelete(Fruits.class);
		Root<Fruits> root = criteriaDelete.from(Fruits.class);

		criteriaDelete.where(criteriaBuilder.equal(root.get("fruitId"), 1));
		Query query = session.createQuery(criteriaDelete);
		int i = query.executeUpdate();
		if(i==1) {
			System.out.println(i+"record deleted");
		}

		trans.commit(); session.close();


	}
}
