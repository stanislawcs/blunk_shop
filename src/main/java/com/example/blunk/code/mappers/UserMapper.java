package com.example.blunk.code.mappers;

import com.example.blunk.code.domain.User;
import com.example.blunk.code.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {
    private final ModelMapper modelMapper;

    public User toEntity(UserDTO userDTO){
        return modelMapper.map(userDTO,User.class);
    }

    public UserDTO toDTO(User user){
        return modelMapper.map(user,UserDTO.class);
    }
}
