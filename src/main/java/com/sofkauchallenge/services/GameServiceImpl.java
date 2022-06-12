package com.sofkauchallenge.services;

import com.sofkauchallenge.Dtos.*;
import com.sofkauchallenge.entities.Game;
import com.sofkauchallenge.entities.Round;
import com.sofkauchallenge.entities.RoundId;
import com.sofkauchallenge.repositories.AnswerRepository;
import com.sofkauchallenge.repositories.GameRepository;
import com.sofkauchallenge.repositories.QuestionRepository;
import com.sofkauchallenge.repositories.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    GameRepository gameRepository;
    @Autowired
    RoundRepository roundRepository;
    @Autowired
    AnswerRepository answerRepository;
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    DtoMapper dtoMapper;

    @Override
    @Transactional
    public GameDto startGame(PlayerDto playerDto) {
        GameDto gameDto = new GameDto();
        Game game;

        gameDto.setUserName(playerDto);
        gameDto.setCoins(0);
        gameDto.setResult("start");
        gameDto.setDate(Instant.now());
        game = dtoMapper.fromGameDtoToEntity(gameDto);

        gameRepository.save(game);

        gameDto = dtoMapper.fromEntityToGameDto(game);

        return gameDto;
    }

    @Override
    @Transactional
    public RoundDto selectRound(GameDto gameDto, CategoryDto categoryDto, int price) {
        RoundDto roundDto = new RoundDto();
        Round round;
        RoundIdDto roundIdDto = new RoundIdDto();

        roundIdDto.setGameId(gameDto.getId());
        roundIdDto.setCategoryId(categoryDto.getId());

        roundDto.setId(roundIdDto);
        roundDto.setGame(gameDto);
        roundDto.setPrice(price);
        roundDto.setCategory(categoryDto);
        round = dtoMapper.fromRoundDtoToEntity(roundDto);

        roundRepository.save(round);

        roundDto = dtoMapper.fromEntityToRounDto(round);

        return roundDto;
    }

    @Override
    public CategoryDto selectCategory(RoundDto roundDto) {
        CategoryDto categoryDto;

        categoryDto = roundDto.getCategory();

        return categoryDto;
    }

    @Override
    public QuestionDto randomQuestion(CategoryDto categoryDto) {
        List<QuestionDto> questionDtos = new ArrayList<>();
        List<QuestionDto> questionDtosByCategory;
        QuestionDto questionDto;
        Random random = new Random();
        int randomIndex;

        questionRepository
                .findAll()
                .forEach(question -> questionDtos
                        .add(dtoMapper
                                .fromEntityToQuestionDto(question)));

        questionDtosByCategory = questionDtos
                .stream()
                .filter(question -> question
                        .getCategory()
                        .equals(categoryDto))
                .toList();

        randomIndex = random.nextInt(questionDtosByCategory.size());
        questionDto = questionDtosByCategory.get(randomIndex);
        return questionDto;
    }

    @Override
    public List<AnswerDto> searchAnswers(QuestionDto questionDto) {
        List<AnswerDto> answerDtos = new ArrayList<>();
        List<AnswerDto> answerDtosByQuestion;

        answerRepository
                .findAll()
                .forEach(answer -> answerDtos
                        .add(dtoMapper
                                .fromEntityToAnswerDto(answer)));

        answerDtosByQuestion = answerDtos
                .stream()
                .filter(answerDto -> answerDto
                        .getQuestion()
                        .equals(questionDto))
                .toList();

        return answerDtosByQuestion;
    }


    @Override
    public Boolean gameOver(AnswerDto answerDto, GameDto gameDto) {
        return null;
    }
}
