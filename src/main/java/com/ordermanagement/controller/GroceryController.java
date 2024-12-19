package com.ordermanagement.controller;

import com.ordermanagement.service.IGroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryController {

    @Autowired
    private IGroceryService groceryService;
}
