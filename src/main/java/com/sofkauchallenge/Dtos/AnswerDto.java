package com.sofkauchallenge.Dtos;

import lombok.Data;

@Data
public class AnswerDto {
    private Integer id;
    private String answer;
    private Integer isCorrect;
    private QuestionDto question;
}
