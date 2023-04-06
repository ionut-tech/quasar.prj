package com.light.bit.lash;

import com.light.bit.lash.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Slf4j
public class SimpleUserClientAPI {
    private final WebClient webClient;

    public static void main(String[] args) {
        SimpleUserClientAPI userClientAPI = new SimpleUserClientAPI();
        userClientAPI.getUsers().subscribe(user -> log.info("---------------- NEXT: " + user));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.info(e.getMessage());
        }
        log.info("Exit");
    }

    public SimpleUserClientAPI() {
        this.webClient = WebClient.builder()
                .baseUrl("http://localhost:8080/users")
                .build();
    }
    public Flux<UserDTO> getUsers() {
        return webClient
                .get()
                .retrieve()
                .bodyToFlux(UserDTO.class);
    }
}
