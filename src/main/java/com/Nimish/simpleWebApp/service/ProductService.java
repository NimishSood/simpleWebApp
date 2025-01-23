package com.Nimish.simpleWebApp.service;

import com.Nimish.simpleWebApp.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Service
@Setter
public class ProductService
{
    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101,"iPhone",50000),
            new Product(102,"Canon Camera",70000),
            new Product(103,"Shure Mic",10000)));

    public Product getProductById(int prodId)
    {
//        for (Product product : products)
//        {
//            if (product.getProdId() == id)
//            {
//                return product;
//            }
//        }
        return products.stream()
                .filter(product-> product.getProdId()==prodId)
                .findFirst().orElseGet(()->new Product(100,"No Product",100)); // using stream API if we do not find a project with a matching id we create
                // a new product with the given parameters
    }
    public void addProduct(Product product)
    {
        System.out.println(product);
        products.add(product);
    }

}
