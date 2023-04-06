package com.light.bit.lash.model;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("male"), FEMALE("female");
    private String name;

    Gender(String name) {
        this.name = name;
    }
}
