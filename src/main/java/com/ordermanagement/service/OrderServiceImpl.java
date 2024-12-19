package com.ordermanagement.service;


import com.ordermanagement.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService{

    @Autowired
    private OrderRepository orderRepository;
}
