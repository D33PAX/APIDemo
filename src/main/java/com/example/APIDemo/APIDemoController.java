package com.example.APIDemo;

import com.example.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class APIDemoController {

    List<Product> list = new ArrayList<Product>();

    @GetMapping("/products")
    public List<Product> helloWorld(){
        return list;
    }

    @GetMapping("/products/{id}")
    public Product helloWorld(@PathVariable long id){
        return list.stream().filter(e -> e.getId() == id).findAny().orElse(null);
    }


    @PostMapping("/products/")
    public Product addProduct(@RequestBody Product product){

        Product p = new Product();
        p.setId(product.getId());
        p.setName(product.getName());
        p.setPrice(product.getPrice());

        list.add(p);

        return p;

    }
}
