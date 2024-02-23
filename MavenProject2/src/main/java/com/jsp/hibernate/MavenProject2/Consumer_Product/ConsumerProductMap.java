package com.jsp.hibernate.MavenProject2.Consumer_Product;

import java.util.List; 

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ConsumerProductMap {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//				Consumer consumer1 = new Consumer();
//				consumer1.setConsumerId(1);
//				consumer1.setConsumerName("Smith");
//		
//				Consumer consumer2 = new Consumer();
//				consumer2.setConsumerId(2);
//				consumer2.setConsumerName("Mahesh");
//		
//				Consumer consumer3 = new Consumer();
//				consumer3.setConsumerId(3);
//				consumer3.setConsumerName("Allen");
//		
//				Consumer consumer4 = new Consumer();
//				consumer4.setConsumerId(4);
//				consumer4.setConsumerName("James");
//		
//				Consumer consumer5 = new Consumer();
//				consumer5.setConsumerId(5);
//				consumer5.setConsumerName("Rakesh");
//		
//				Consumer consumer6 = new Consumer();
//				consumer6.setConsumerId(6);
//				consumer6.setConsumerName("Jayanth");
//		
//				Consumer consumer7 = new Consumer();
//				consumer7.setConsumerId(7);
//				consumer7.setConsumerName("Uday");
//		
//				Product product = new Product();
//				product.setProductId(101);
//				product.setProductName("Mobile");
//				product.setProductPrice(15000);
//				product.setConsumer(consumer7);
//		
//		
//				Product product1 = new Product();
//				product1.setProductId(102);
//				product1.setProductName("Laptop");
//				product1.setProductPrice(43200);
//		
//				Product product2 = new Product();
//				product2.setProductId(103);
//				product2.setProductName("Dresses");
//				product2.setProductPrice(7800);
//				product2.setConsumer(consumer3);
//		
//				Product product3 = new Product();
//				product3.setProductId(104);
//				product3.setProductName("Furniture");
//				product3.setProductPrice(5700);
//				product3.setConsumer(consumer1);
//		
//				Product product4 = new Product();
//				product4.setProductId(105);
//				product4.setProductName("Utensils");
//				product4.setProductPrice(3200);
//		
//				Product product5= new Product();
//				product5.setProductId(106);
//				product5.setProductName("Electronic Gadgets");
//				product5.setProductPrice(39000);


		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Consumer.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		//select * from products where consumer isNull
		//select * from products where consumer isNotNull     just change the method name to fetch two queries

		Criteria criteria = session.createCriteria(Product.class).add(Restrictions.isNull("consumer"));
		List<Product> list = criteria.list();

		for(Product p : list) {
			System.out.println(p);
		}

//				session.save(product);
//				session.save(product1);
//				session.save(product2);
//				session.save(product3);
//				session.save(product4);
//				session.save(product5);
//				session.save(consumer1);
//				session.save(consumer2);
//				session.save(consumer3);
//				session.save(consumer4);
//				session.save(consumer5);
//				session.save(consumer6);
//				session.save(consumer7);

		trans.commit();
		session.close();
	}
}
