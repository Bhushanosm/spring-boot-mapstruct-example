package com.example.demo.controller;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.OrderEntity;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO) {
        OrderEntity orderEntity = orderService.saveOrder(orderDTO);
        return orderService.getOrderDTO(orderEntity);
    }

    @GetMapping("/{id}")
    public OrderDTO getOrder(@PathVariable Long id) {
        // Retrieve orderEntity from repository or service here
        OrderEntity orderEntity = new OrderEntity(); // Assume fetching entity from DB
        return orderService.getOrderDTO(orderEntity);
    }
}
