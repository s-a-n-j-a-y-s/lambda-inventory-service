package com.lambda.inventory_service.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String getTestString() {
        return "Hello World! - I am LAMBDA, your inventory tracker!";
    }
}
