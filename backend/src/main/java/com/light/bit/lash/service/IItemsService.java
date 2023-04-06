package com.light.bit.lash.service;

import com.light.bit.lash.dto.ItemsDTO;
import com.light.bit.lash.model.Items;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface IItemsService {
    Mono<ItemsDTO> addNewItem(Items items);
    Mono<ItemsDTO> findItem(Long idItem);
    Mono<Void> deleteItem(Long idItem);
    Flux<ItemsDTO> getAllItems();
}
