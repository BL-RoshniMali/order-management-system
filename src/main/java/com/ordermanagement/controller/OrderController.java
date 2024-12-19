package com.ordermanagement.controller;

import com.ordermanagement.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;
}
