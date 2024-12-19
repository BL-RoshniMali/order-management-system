package com.ordermanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order-table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private String Customer;
    private String GroceryItems;
    private LocalDate orderDate;
    private long totalPrice;


}
