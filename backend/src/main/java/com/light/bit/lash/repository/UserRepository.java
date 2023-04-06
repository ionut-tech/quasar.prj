package com.light.bit.lash.repository;

import com.light.bit.lash.dto.UserDTO;
import com.light.bit.lash.model.User;
import com.light.bit.lash.service.IUserService;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, Long>{
    Mono<UserDTO> findByUsername(String username);
    Mono<Void> deleteUserByUsername(String username);
    Mono<UserDTO> findByEmail(String email);
}
