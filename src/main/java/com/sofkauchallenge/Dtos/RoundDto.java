package com.sofkauchallenge.Dtos;

import lombok.Data;

@Data
public class RoundDto {
    private RoundIdDto id;
    private GameDto game;
    private CategoryDto category;
    private Integer price;
}
