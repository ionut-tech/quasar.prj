package com.light.bit.lash.service;

import com.light.bit.lash.dto.UserDTO;
import com.light.bit.lash.model.User;
import com.light.bit.lash.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Mono<UserDTO> addNewUser(User user) {
        return userRepository.save(user).map(newUser -> modelMapper.map(newUser, UserDTO.class));
    }

    @Override
    public Flux<UserDTO> getUsers() {
        return userRepository.findAll().map(user -> modelMapper.map(user, UserDTO.class));
    }

    @Override
    public Mono<UserDTO> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Mono<Void> deleteUserByUsername(String username) {
        return userRepository.deleteUserByUsername(username);
    }


    @Override
    public Mono<UserDTO> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
