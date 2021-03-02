package org.ksen.demo.java.springboot.simple;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DemoService {
    public List<Product> getProducts(){
        return Arrays.asList(
                new Product(1,"Car",10),
                new Product(2,"ABC",3),
                new Product(3, "Toy",200)
        );
    }
}
