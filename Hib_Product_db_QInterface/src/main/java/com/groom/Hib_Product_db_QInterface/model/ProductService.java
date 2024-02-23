package com.groom.Hib_Product_db_QInterface.model;

import java.util.List;

public interface ProductService {
	
	void addProduct(Product p);
	Product findProductById(int productId);
	Product findProductByName(String productName);
	List<Product> productBetweenPrices(int productPrice1,int productPrice2);
	List<Product> findAllProductsByCategory(String productCategory);
	void updateProductStatus(String productStatus1,String productStatus2);
	void updateProductPriceByName(String productName,int productPrice);
	void deleteProductByBrand(String productBrand);
	void deleteProductByCategory(String productcategory);
}
