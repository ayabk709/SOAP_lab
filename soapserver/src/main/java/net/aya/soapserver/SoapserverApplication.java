package net.aya.soapserver;

import jakarta.xml.ws.Endpoint;
import net.aya.soapserver.entity.Product;
import net.aya.soapserver.service.ProductwebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapserverApplication implements CommandLineRunner {

    @Autowired
    private ProductwebService productwebService; // This is the Spring-managed bean

    public static void main(String[] args) {
        SpringApplication.run(SoapserverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //il va generer le wsdl
        String url = "http://localhost:8085/ProductWs";

        // Use the Spring-managed instance of ProductwebService
        Endpoint.publish(url, productwebService); // Publish the Spring-managed service
        System.out.println("Server is running on " + url);

        // Create a new product
        Product product = new Product();
        product.setName("Sample Product");
        product.setPrice(100.0);
        product.setQuantity(10);

        // Add the product using the service
        productwebService.addProduct(product); // This works as expected
    }
}
