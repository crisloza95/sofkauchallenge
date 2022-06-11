package com.sofkauchallenge.Dtos;

import lombok.Data;

@Data
public class QuestionDto {
    private Integer id;
    private String question;
    private CategoryDto category;
}
