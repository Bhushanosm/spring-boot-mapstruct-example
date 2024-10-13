package com.example.demo.service;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.OrderEntity;
import com.example.demo.mapper.OrderMapper;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderMapper orderMapper = OrderMapper.INSTANCE;

    public OrderDTO getOrderDTO(OrderEntity orderEntity) {
        return orderMapper.toDto(orderEntity);
    }

    public OrderEntity saveOrder(OrderDTO orderDTO) {
        return orderMapper.toEntity(orderDTO);
    }
}
