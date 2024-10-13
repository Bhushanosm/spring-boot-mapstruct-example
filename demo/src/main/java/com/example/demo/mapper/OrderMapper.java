package com.example.demo.mapper;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "id", target = "orderId")
    OrderDTO toDto(OrderEntity orderEntity);

    @Mapping(source = "orderId", target = "id")
    OrderEntity toEntity(OrderDTO orderDTO);
}
