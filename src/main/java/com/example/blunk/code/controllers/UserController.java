package com.example.blunk.code.controllers;

import com.example.blunk.code.domain.Order;
import com.example.blunk.code.dto.UserDTO;
import com.example.blunk.code.services.OrderService;
import com.example.blunk.code.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final OrderService orderService;

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @GetMapping("/orders/{id}")
    public List<Order> getListOfOrdersByUserId(@PathVariable("id") Long id) {
        return orderService.getAllByUserId(id);
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody @Valid UserDTO userDTO){
        userService.add(userDTO);
        return new ResponseEntity<>("User added", HttpStatus.CREATED);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> updateById(@PathVariable("id") Long id, @RequestBody @Valid UserDTO userDTO) {
        userService.update(userDTO, id);
        return new ResponseEntity<>("User is updated", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
        userService.delete(id);
        return new ResponseEntity<>("User is deleted",HttpStatus.OK);
    }

}
