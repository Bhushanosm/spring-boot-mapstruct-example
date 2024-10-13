package com.example.demo.entity;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class OrderItemEntity {
    private Long id;
    private String product;
    private Integer quantity;
}
