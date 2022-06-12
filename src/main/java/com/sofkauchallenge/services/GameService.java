package com.sofkauchallenge.services;

import com.sofkauchallenge.Dtos.*;
import com.sofkauchallenge.entities.*;

import java.util.List;

public interface GameService {

    public GameDto startGame(PlayerDto playerDto);
    public RoundDto selectRound(GameDto gameDto, CategoryDto categoryDto, int price);
    public CategoryDto selectCategory(RoundDto roundDto);
    public QuestionDto randomQuestion(CategoryDto categoryDto);
    public List<AnswerDto> searchAnswers(QuestionDto questionDto);
    public Boolean gameOver(AnswerDto answerDto, GameDto gameDto);

}
