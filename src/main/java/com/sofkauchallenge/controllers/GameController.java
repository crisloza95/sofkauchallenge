package com.sofkauchallenge.controllers;

import com.sofkauchallenge.Dtos.*;
import com.sofkauchallenge.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping("/newgame")
    public GameDto startGame(@RequestBody PlayerDto playerDto) {
        return gameService.startGame(playerDto);
    }

    @PostMapping("/round")
    public RoundDto selectRound(@RequestBody GameDto gameDto, CategoryDto categoryDto) {
        int price = 12;
        return gameService.selectRound(gameDto, categoryDto, price);
    }

    @PostMapping("/category")
    public CategoryDto selectCategory(@RequestBody RoundDto roundDto) {
        return gameService.selectCategory(roundDto);
    }

    @PostMapping("/question")
    public QuestionDto randomQuestion(@RequestBody CategoryDto categoryDto) {
        return gameService.randomQuestion(categoryDto);
    }

    @PostMapping("/answers")
    public List<AnswerDto> searchAnswers(@RequestBody QuestionDto questionDto) {
        return gameService.searchAnswers(questionDto);
    }




}
