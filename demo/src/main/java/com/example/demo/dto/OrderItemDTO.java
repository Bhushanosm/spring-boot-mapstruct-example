package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class OrderItemDTO {
    private Long id;
    private String product;
    private Integer quantity;
}
