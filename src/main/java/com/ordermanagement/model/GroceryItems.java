package com.ordermanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "grocery-items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroceryItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long groceryId;
    private String name;
    private String category;
    private long price;
    private int quantity;
}
