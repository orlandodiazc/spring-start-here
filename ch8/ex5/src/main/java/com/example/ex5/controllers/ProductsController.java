package com.example.ex5.controllers;

import com.example.ex5.model.Product;
import com.example.ex5.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(@RequestParam String name, @RequestParam double price, Model model) {
        var p = new Product(name, price);
        productService.addProduct(p);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
}
