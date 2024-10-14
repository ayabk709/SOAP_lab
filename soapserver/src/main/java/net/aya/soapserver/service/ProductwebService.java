package net.aya.soapserver.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import net.aya.soapserver.entity.Product;
import net.aya.soapserver.repository.ProductRepisitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@WebService(serviceName = "ProductWs")
@Service
public class ProductwebService {
    @Autowired
    private  ProductRepisitory productRepository;
//crud
    @WebMethod(operationName = "addProduct")
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    // Update
    @WebMethod(operationName = "updateProduct")
    public Product updateProduct(Long id, Product updatedProduct) {
        if (productRepository.existsById(id)) {
            updatedProduct.setId(id);
            return productRepository.save(updatedProduct);
        }
        return null;
    }

    @WebMethod(operationName = "sellingprice")
public Double sellingprice(@WebParam(name = "price") Double price){
   return price*1.2;
}
    // Delete
    @WebMethod(operationName = "deleteProduct")
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

//The @WebMethod annotation is used in JAX-WS
// web services to expose a method as a web service operation
    // Read
    @WebMethod(operationName = "getAllProducts")
        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }


        @WebMethod(operationName = "getProductById")
        public Product getProductById(Long id) {
            return productRepository.findById(id).orElse(null);  // Return null if not found
        }



}
