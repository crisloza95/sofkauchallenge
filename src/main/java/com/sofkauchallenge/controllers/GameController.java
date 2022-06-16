package com.sofkauchallenge.controllers;

import com.sofkauchallenge.Dtos.*;
import com.sofkauchallenge.entities.Game;
import com.sofkauchallenge.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/newgame")
    public GameDto startGame(@RequestBody PlayerDto playerDto) {
        return gameService.startGame(playerDto);
    }
//
//    @PostMapping("/round")
//    public RoundDto selectRound(@RequestBody GameDto gameDto) {
//        return gameService.selectRound(gameDto);
//    }
//
//    @PostMapping("/category")
//    public CategoryDto selectCategory(@RequestBody RoundDto roundDto) {
//        return gameService.selectCategory(roundDto);
//    }
//
//    @PostMapping("/question")
//    public QuestionDto randomQuestion(@RequestBody CategoryDto categoryDto) {
//        return gameService.randomQuestion(categoryDto);
//    }
//
//    @PostMapping("/answers")
//    public List<AnswerDto> searchAnswers(@RequestBody QuestionDto questionDto) {
//        return gameService.searchAnswers(questionDto);
//    }


    @PostMapping("/game")
    public List<AnswerDto> playGame(@RequestBody GameDto gameDto) {
        var roundDto = gameService.selectRound(gameDto);
        var categoryDto = gameService.selectCategory(roundDto);
        var questionDto = gameService.randomQuestion(categoryDto);
        return gameService.searchAnswers(questionDto);
    }
}
