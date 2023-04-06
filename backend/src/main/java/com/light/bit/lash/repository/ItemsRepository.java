package com.light.bit.lash.repository;

import com.light.bit.lash.model.Items;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ItemsRepository extends ReactiveMongoRepository<Items, Long> {

}
