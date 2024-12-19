package com.ordermanagement.controller;

import com.ordermanagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService customerService;
}
