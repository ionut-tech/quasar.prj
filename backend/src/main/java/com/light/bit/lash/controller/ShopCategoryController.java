package com.light.bit.lash.controller;


import com.light.bit.lash.dto.ShopCategoryDTO;
import com.light.bit.lash.model.ShopCategory;
import com.light.bit.lash.service.IShopCategoryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/shopcategory")
public class ShopCategoryController {
    private final IShopCategoryService shopCategoryService;

    public ShopCategoryController(IShopCategoryService shopCategoryService) {
        this.shopCategoryService = shopCategoryService;
    }

    @GetMapping
    public Flux<ShopCategoryDTO> getAll() {
        return shopCategoryService.getAllCategory();
    }

    @GetMapping("/{idCategory}")
    public Mono<ShopCategoryDTO> findCategoryById(@PathVariable Long idCategory) {
        return shopCategoryService.findCategory(idCategory);
    }

    @DeleteMapping("/{idCategory}")
    public Mono<Void> deleteCategoryById(@PathVariable Long idCategory) {
        return shopCategoryService.deleteCategory(idCategory);
    }

    @PostMapping()
    public Mono<ShopCategoryDTO> addNewCategory(@RequestBody ShopCategory category) {
        return shopCategoryService.addNewCategory(category);
    }

}
