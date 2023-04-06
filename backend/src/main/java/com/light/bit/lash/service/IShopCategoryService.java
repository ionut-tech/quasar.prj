package com.light.bit.lash.service;

import com.light.bit.lash.dto.ShopCategoryDTO;
import com.light.bit.lash.model.ShopCategory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface IShopCategoryService {
    Mono<ShopCategoryDTO> addNewCategory(ShopCategory shopCategory);
    Mono<Void> deleteCategory(Long idCategory);
    Mono<ShopCategoryDTO> findCategory(Long idCategory);
    Flux<ShopCategoryDTO> getAllCategory();
}
