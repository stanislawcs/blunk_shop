package com.example.blunk.code.services.impl;

import com.example.blunk.code.domain.User;
import com.example.blunk.code.domain.exceptions.UserNotFoundException;
import com.example.blunk.code.dto.UserDTO;
import com.example.blunk.code.mappers.UserMapper;
import com.example.blunk.code.repositories.UserRepository;
import com.example.blunk.code.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDTO getById(Long id) {
        return userMapper.toDTO(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found")));
    }

    @Override
    @Transactional
    public void add(UserDTO userDTO) {
        userRepository.save(userMapper.toEntity(userDTO));
    }

    @Override
    @Transactional
    public void update(UserDTO userDTO, Long id) {
        User user = userMapper.toEntity(userDTO);
        user.setId(id);
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
