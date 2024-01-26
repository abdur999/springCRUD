package com.spring.crud.controller;

import com.spring.crud.model.Product;
import com.spring.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        System.out.println("Api getting called");
        return  productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return  productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return  productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id) {
        return  productService.getProductById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return  productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return  productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String findProductByName(@PathVariable int id) {
        return  productService.deleteProduct(id);
    }

}
