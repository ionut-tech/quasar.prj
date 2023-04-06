package com.light.bit.lash.service;

import com.light.bit.lash.dto.ShopCategoryDTO;
import com.light.bit.lash.model.ShopCategory;
import com.light.bit.lash.repository.ShopCategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ShopCategoryService implements IShopCategoryService {
    private final ShopCategoryRepository shopCategoryRepository;
    private final ModelMapper modelMapper;

    public ShopCategoryService(ShopCategoryRepository shopCategoryRepository, ModelMapper modelMapper) {
        this.shopCategoryRepository = shopCategoryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Mono<ShopCategoryDTO> addNewCategory(ShopCategory shopCategory) {
        return shopCategoryRepository.save(shopCategory).map(newCategory -> modelMapper.map(newCategory, ShopCategoryDTO.class));
    }

    @Override
    public Flux<ShopCategoryDTO> getAllCategory() {
        return shopCategoryRepository.findAll().map(shopCategory -> modelMapper.map(shopCategory, ShopCategoryDTO.class));
    }

    @Override
    public Mono<Void> deleteCategory(Long idCategory) {
        return shopCategoryRepository.deleteById(idCategory);
    }

    @Override
    public Mono<ShopCategoryDTO> findCategory(Long idCategory) {
        return shopCategoryRepository.findById(idCategory).map(shopCategory -> modelMapper.map(shopCategory, ShopCategoryDTO.class));
    }
}
