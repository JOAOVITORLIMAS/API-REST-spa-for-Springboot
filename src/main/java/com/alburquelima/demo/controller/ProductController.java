package com.alburquelima.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alburquelima.demo.entities.Department;
import com.alburquelima.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects(){
        Department d1 = new Department(1,"Tech");
        Department d2 = new Department(2, "Pet");
        
        Product p1 = new Product(1l, "MacBook Pro", 4000.00, d1);
        Product p2 = new Product(2l, "PC Gamer", 5000.00, d1);
        Product p3 = new Product(3l, "Pet House", 300.00, d2);
        Product p4 = new Product(4l, "Coleiras PetHouse", 100.00, d2);
             
    
        List<Product> list = Arrays.asList(p1,p2,p3,p4);
        return list;


        



    }


    
}
