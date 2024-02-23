package com.jsp.hibernate.MyFIrstHibProject.Cart_Item;

import java.util.Arrays; 

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingCartItem {
	public static void main(String[] args) {

		Cart c = new Cart();
		c.setcId(1);
		c.setcCapacity(10);



		Cart c1 = new Cart();
		c1.setcId(2);
		c1.setcCapacity(20);

		Cart c2 = new Cart();
		c2.setcId(3);
		c2.setcCapacity(30);


		Item i = new Item();
		i.setiId(1000);
		i.setIname("Sunflower oil");
		i.setIprice(100);

		Item i1 = new Item();
		i1.setiId(1001);
		i1.setIname("MArrygold");
		i1.setIprice(50);

		Item i2 = new Item();
		i2.setiId(1003);
		i2.setIname("Maida");
		i2.setIprice(200);

		c.setiList(Arrays.asList(i));
		c1.setiList(Arrays.asList(i2));
		c2.setiList(Arrays.asList(i1));
		
		i.setCartList(Arrays.asList(c));
		i1.setCartList(Arrays.asList(c2));
		i2.setCartList(Arrays.asList(c1));

		Session session = new Configuration()
				.configure().addAnnotatedClass(Cart.class).
				addAnnotatedClass(Item.class).buildSessionFactory().openSession();
		Transaction trans = session.beginTransaction();

		session.save(c);
		session.save(c1);
		session.save(c2);
		session.save(i);
		session.save(i1);
		session.save(i2);

		trans.commit();
		session.close();
	}

}
