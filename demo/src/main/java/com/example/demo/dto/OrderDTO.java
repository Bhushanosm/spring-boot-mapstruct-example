package com.example.demo.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDTO {
    private Long orderId;
    private String customerName;
    private LocalDate orderDate;
    private List<OrderItemDTO> items;
}
