package com.light.bit.lash;

import com.light.bit.lash.model.Address;
import com.light.bit.lash.model.Gender;
import com.light.bit.lash.model.User;
import com.light.bit.lash.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@Slf4j
public class LashApplication {

    public static void main(String[] args) {
        SpringApplication.run(LashApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository repository) {
        Address address1 = Address.builder().country("Romania").county("Bihor").city("Vadu Crisului").street("Principala").no("590").postalCode("716232").build();
        Address address2 = Address.builder().country("Romania").county("Bihor").city("Oradea").street("Grigore Ureche").no("13").postalCode("716232").build();
        return args -> {
            Flux<User> productFlux = Flux.just(

                    new User(1L,"FirstName1", "LastName1", "mc", "secret1", "secret1", "elUser1@yahoo.com",Date.valueOf(LocalDate.of(1985, 12, 21)), Gender.MALE, "0774068842", List.of(address1)),
                    new User(2L,"FirstName2", "LastName2", "ac", "secret2", "secret2", "elUSer2@yahoo.com",Date.valueOf(LocalDate.of(1994, 8, 6)), Gender.MALE, "0774068842", List.of(address2)),
                    new User(3L,"FirstName3", "LastName3", "mh", "secret3", "secret3", "elUser3@yahoo.com",Date.valueOf(LocalDate.of(1992, 9, 15)), Gender.MALE, "0774068842", List.of(address2))

            ).flatMap(repository::save);
            productFlux.thenMany(repository.findAll())
                    .map(User::toString)
                    .subscribe(log::info);
        };
    }
}
