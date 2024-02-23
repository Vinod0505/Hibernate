package com.groom.Hib_Product_db_QInterface;

import java.util.List;

import com.groom.Hib_Product_db_QInterface.model.Product;
import com.groom.Hib_Product_db_QInterface.model.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Product p = new Product();
    	
      ProductServiceImpl impl = new ProductServiceImpl();
//       p.setProductId(102);
//       p.setProductName("Soap");
//       p.setProductBrand("MysoreSandal");
//       p.setProductPrice(40);
//       p.setProductCategory("Cosmetics");
//       p.setProductStatus("Not Available");
//       impl.addProduct(p);
      
//     System.out.println(impl.findProductById(101));
//      System.out.println(impl.findProductByName("Shampoo"));
//      List<Product> list = impl.findAllProductsByCategory("Cosmetics");
//      for(Product ps : list) {
//    	  System.out.println(ps);
//      }
      
//     impl.updateProductStatus("Available","Not Available");
//     impl.deleteProductByBrand("Meera");
 
//   Product product = impl.findProductById(102);
//   System.out.println(product);
//   
//   Product product2 = impl.findProductById(102);
//   System.out.println(product2);
      
      Product byName = impl.findProductByName("Soap");
      System.out.println(byName);
      
      
      Product byName2 = impl.findProductByName("Soap");
      System.out.println(byName2);
      
      
      
      
      
      
      
      
      
      
      
    }
}
