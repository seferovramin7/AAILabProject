package com.example.aailabproject.repo;

import com.example.aailabproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    ArrayList<Order> findAllByCustomerId(int customerId);
}

