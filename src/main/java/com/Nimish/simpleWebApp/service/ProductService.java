package com.Nimish.simpleWebApp.service;

import com.Nimish.simpleWebApp.model.Product;
import com.Nimish.simpleWebApp.repository.ProductRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Service
@Setter
public class ProductService
{
    @Autowired
    ProductRepo repo;

    //These are all the built-in methods of the JPA interface
    public List<Product>getProducts()
    {
        return repo.findAll();
    }

    public Product getProductById(int prodId)
    {
        return repo.findById(prodId).orElse(null);
    }

    public void addProduct(Product product)
    {
        repo.save(product);
    }
    // No unique method to update, if the object does not exist it creates one
    public void updateProduct(Product product)
    {
        repo.save(product);
    }

    public void deleteProduct(int prodId)
    {
        repo.deleteById(prodId);
    }
}
