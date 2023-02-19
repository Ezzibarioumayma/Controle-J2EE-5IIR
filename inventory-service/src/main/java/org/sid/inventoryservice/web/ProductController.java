package org.sid.inventoryservice.web;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;
    @GetMapping("/api/products/random")
    public List<Product> getRandomProducts(){
        List<Product> products=productRepository.findAll();
        Random random=new Random();
        int from=random.nextInt((products.size()-4));
        return products.subList(from,from+3);
    }
}
