package com.example.aailabproject.controller;

import com.example.aailabproject.entity.Order;
import com.example.aailabproject.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final CustomerService customerService;

    @GetMapping("order/{customerId}")
    public ArrayList<Order> getOrderByCustomerId(@PathVariable int customerId){
        return customerService.getProductsOfCustomer(customerId);
    }
}
