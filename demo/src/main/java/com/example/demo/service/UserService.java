package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper)
    {
        this.userMapper = userMapper;
    }

    public UserDTO convertToDTO(User user)
    {
        return userMapper.userToUserDTO(user);
    }

    public User convertToEntity(UserDTO userDTO) {
        return userMapper.userDTOToUser(userDTO);
    }

    public List<UserDTO> convertToDTOs(List<User> users) {
        return users.stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }
}