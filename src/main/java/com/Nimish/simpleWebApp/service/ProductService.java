package com.Nimish.simpleWebApp.service;

import com.Nimish.simpleWebApp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Getter
@Service
public class ProductService
{
    List<Product> products= Arrays.asList(
            new Product(101,"iPhone",50000),
            new Product(102,"Canon Camera",70000),
            new Product(103,"Shure Mic",10000));

}
