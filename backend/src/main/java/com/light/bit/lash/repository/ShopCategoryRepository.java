package com.light.bit.lash.repository;

import com.light.bit.lash.model.ShopCategory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ShopCategoryRepository extends ReactiveMongoRepository<ShopCategory, Long> {

}
