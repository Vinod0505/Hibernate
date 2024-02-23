package com.groom.Hib_Product_db_QInterface.model;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProductServiceImpl implements ProductService{

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinod");
	@Override
	public void addProduct(Product p) {
	
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(p);
		et.commit();
	}

	@Override
	public Product findProductById(int productId) {
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("from Product where productId=:productId");
		query.setParameter("productId", productId);
		query.setHint("org.hibernate.cacheable", true);
		Product product = (Product)query.getSingleResult();
		et.commit();
		em.close();
		return product;
	}

	@Override
	public Product findProductByName(String productName) {
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("from Product where productName=:productName");
		query.setParameter("productName", productName);
		query.setHint("org.hibernate.cacheable", true);
		Product product = (Product)query.getSingleResult();
		et.commit();
		em.close();
		return product;
	}

	@Override
	public List<Product> productBetweenPrices(int productPrice1,int productPrice2) {
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("from Product where productPrice between :productPrice1 and :productPrice2");
		query.setParameter("productPrice1", productPrice1);
		query.setParameter("productPrice2", productPrice2);
		query.setHint("org.hibernate.cacheable", true);
		et.commit();
		em.close();
		List<Product> list = query.getResultList();
		return list;
	}

	@Override
	public List<Product> findAllProductsByCategory(String productCategory) {
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("from Product where productCategory=:productCategory");
		query.setParameter("productCategory", productCategory);
		query.setHint("org.hibernate.cacheable", true);
		List<Product> list = query.getResultList();
		et.commit();
		em.close();
		return list;
	}

	@Override
	public void updateProductStatus(String productStatus1,String productStatus2) {
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("update Product set productStatus=:productStatus1 where productStatus=:productStatus2");
		query.setParameter("productStatus1", productStatus1);
		query.setParameter("productStatus2", productStatus2);
		query.setHint("org.hibernate.cacheable", true);
		int update = query.executeUpdate();
		System.out.println(update+" rows updated");
		et.commit();
		em.close();
	}

	@Override
	public void updateProductPriceByName(String productName,int productPrice) {
		EntityManager em =	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("Update Product set productPrice=:productPrice where productName=:productName");
		query.setParameter("productPrice", productPrice);
		query.setParameter("productName", productName);
		query.setHint("org.hibernate.cacheable", true);
		int update = query.executeUpdate();
		et.commit();
		em.close();
		if(update!=0) {
			System.out.println(update + " updated record");
		}
	}

	@Override
	public void deleteProductByBrand(String productBrand) {
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("delete from Product where productBrand=:productBrand");
		query.setParameter("productBrand", productBrand);
		query.setHint("org.hibernate.cacheable", true);
		int delete = query.executeUpdate();
		System.out.println(delete);
		et.commit();
		em.close();
	}

	@Override
	public void deleteProductByCategory(String productCategory) {
		EntityManager em = 	emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery("delete from Product where productCategory=:productCategory");
		query.setParameter("productCategory", productCategory);
		query.setHint("org.hibernate.cacheable", true);
		int delete = query.executeUpdate();
		System.out.println(delete);
		et.commit();
		em.close();

	}

}
