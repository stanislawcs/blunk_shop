package com.example.blunk.code.services.impl;

import com.example.blunk.code.domain.Order;
import com.example.blunk.code.repositories.OrderRepository;
import com.example.blunk.code.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllByUserId(Long id) {
        return orderRepository.findAllByUserId(id);
    }
}
