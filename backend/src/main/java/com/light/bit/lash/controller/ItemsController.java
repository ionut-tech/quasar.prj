package com.light.bit.lash.controller;

import com.light.bit.lash.dto.ItemsDTO;
import com.light.bit.lash.model.Items;
import com.light.bit.lash.service.IItemsService;
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
@RequestMapping("/items")
public class ItemsController {
    private final IItemsService itemsService;

    public ItemsController(IItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public Flux<ItemsDTO> getAllItems() {
        return itemsService.getAllItems();
    }

    @GetMapping("/{idItem}")
    public Mono<ItemsDTO> findItemsById(@PathVariable Long idItem) {
        return itemsService.findItem(idItem);
    }

    @PostMapping
    public Mono<ItemsDTO> addItems(@RequestBody Items items) {
        return itemsService.addNewItem(items);
    }

    @DeleteMapping("/{idItem}")
    public Mono<Void> deleteItem(@PathVariable Long idItem) {
        return itemsService.deleteItem(idItem);
    }

}
