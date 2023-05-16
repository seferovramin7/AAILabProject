package com.example.aailabproject.service;

import com.example.aailabproject.entity.Order;
import com.example.aailabproject.repo.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    private final OrderRepository orderRepository;

    public CustomerService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public ArrayList<Order> getProductsOfCustomer(int customerId){
        return orderRepository.findAllByCustomerId(customerId);
    }
}
