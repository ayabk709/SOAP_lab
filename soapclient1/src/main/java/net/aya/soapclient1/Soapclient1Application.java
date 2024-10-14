package net.aya.soapclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import proxy1.Product;
import proxy1.ProductWs;
import proxy1.ProductwebService;

import java.util.List;

@SpringBootApplication
public class Soapclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Soapclient1Application.class, args);
		ProductwebService productwebService = new ProductWs().getProductwebServicePort();
		List<Product> products = productwebService.getAllProducts();

		//add

//		Product product = new Product();
//		product.setName("Product 1");
//		product.setPrice(100.0);
//		product.setQuantity(10);
//		productwebService.addProduct(product);


		List<Product> products1 = productwebService.getAllProducts();
		for (Product product1 : products) {
			System.out.println("Product Name: " + product1.getName()); // Use the actual field names
			System.out.println("Product Price: " + product1.getPrice());
			// Print other fields as needed
		}
		//update
		Product product = productwebService.getProductById(302L);
		product.setPrice(200.0);
		productwebService.updateProduct(302L, product);

	}
}

