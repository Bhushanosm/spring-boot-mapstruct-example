package com.example.demo.entity;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class OrderEntity {
    private Long id;
    private String customerName;
    private LocalDate orderDate;
    private List<OrderItemEntity> items;
}
