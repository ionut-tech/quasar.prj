package com.light.bit.lash.controller;

import com.light.bit.lash.dto.UserDTO;
import com.light.bit.lash.model.User;
import com.light.bit.lash.repository.UserRepository;
import com.light.bit.lash.service.IUserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {
    private final IUserService userService;

    UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Flux<UserDTO> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{username}")
    public Mono<UserDTO> getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @DeleteMapping("/{username}")
    public Mono<Void> deleteUser(@PathVariable String username) {
        return userService.deleteUserByUsername(username);
    }

    @PostMapping()
    public Mono<UserDTO> addUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }

    @GetMapping("/findbyemail/{email}")
    public Mono<UserDTO> findUserByEmail(@PathVariable String email) {
        return userService.findUserByEmail(email);
    }

}
