package com.light.bit.lash.service;

import com.light.bit.lash.dto.ItemsDTO;
import com.light.bit.lash.model.Items;
import com.light.bit.lash.repository.ItemsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ItemsService implements IItemsService {
    private final ItemsRepository itemsRepository;
    private final ModelMapper modelMapper;

    public ItemsService(ItemsRepository itemsRepository, ModelMapper modelMapper) {
        this.itemsRepository = itemsRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Mono<ItemsDTO> addNewItem(Items item) {
        return itemsRepository.save(item).map(items -> modelMapper.map(items, ItemsDTO.class));
    }

    @Override
    public Mono<ItemsDTO> findItem(Long idItem) {
        return itemsRepository.findById(idItem).map(items -> modelMapper.map(items, ItemsDTO.class));
    }

    @Override
    public Mono<Void> deleteItem(Long idItem) {
        return itemsRepository.deleteById(idItem);
    }

    @Override
    public Flux<ItemsDTO> getAllItems() {
        return itemsRepository.findAll().map(items -> modelMapper.map(items, ItemsDTO.class));
    }
}
