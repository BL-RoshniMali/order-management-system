package com.ordermanagement.service;

import com.ordermanagement.repository.GroceryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryServiceImpl implements IGroceryService{

    @Autowired
    private GroceryRepository groceryRepository;
}
