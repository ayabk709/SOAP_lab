package net.aya.soapserver.repository;


import net.aya.soapserver.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepisitory extends JpaRepository<Product,Long> {
//C EST LA PARTIE DAO
    //bnisba la partie metier on definier des methode qui utilise les crud
    //JPQL
List<Product> findByName(String name);
}
