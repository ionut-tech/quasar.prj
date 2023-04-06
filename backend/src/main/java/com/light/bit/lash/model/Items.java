package com.light.bit.lash.model;

import jdk.jfr.Relational;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Items {
    @Id
    private Long id;
    private String name;
    private Double price;
    private String brand;
    private Integer quantity;
    private String description;

    private List<ShopCategory> shopCategories;
}
