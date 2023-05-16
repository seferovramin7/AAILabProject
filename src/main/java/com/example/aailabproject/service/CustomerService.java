package com.example.aailabproject.service;

import com.example.aailabproject.entity.Order;
import com.example.aailabproject.repo.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final OrderRepository orderRepository;

    public ArrayList<Order> getProductsOfCustomer(int customerId){
        return orderRepository.findAllByCustomerId(customerId);
    }
}
