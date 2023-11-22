package com.example.blunk.code.services;

import com.example.blunk.code.dto.UserDTO;

public interface UserService {

    UserDTO getById(Long id);

    void add(UserDTO userDTO);

    void update(UserDTO userDTO, Long id);

    void delete(Long id);
}
