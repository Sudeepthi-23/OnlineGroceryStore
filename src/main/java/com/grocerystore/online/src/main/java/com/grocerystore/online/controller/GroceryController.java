package com.grocerystore.online.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryController {

    @GetMapping("/products")
    public List<String> getProducts() {
        return List.of(
                "Rice",
                "Wheat",
                "Milk",
                "Vegetables",
                "Fruits"
        );
    }
}
