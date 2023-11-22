package com.example.blunk.code.services;

import com.example.blunk.code.domain.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllByUserId(Long id);
}
