package com.light.bit.lash.dto;

import com.light.bit.lash.model.ShopCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemsDTO {
    private Long id;
    private String name;
    private Double price;
    private String brand;
    private Integer quantity;
    private String description;
    private List<ShopCategory> shopCategories;
}
