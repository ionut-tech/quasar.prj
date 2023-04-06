package com.light.bit.lash.service;

import com.light.bit.lash.dto.UserDTO;
import com.light.bit.lash.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@Service
public interface IUserService {
    Mono<UserDTO> addNewUser(User user);
    Mono<UserDTO> getUserByUsername(String username);
    Mono<Void> deleteUserByUsername(String username);
    Mono<UserDTO> findUserByEmail(String email);
    Flux<UserDTO> getUsers();
}
