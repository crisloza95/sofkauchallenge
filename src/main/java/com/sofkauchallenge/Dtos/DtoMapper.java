package com.sofkauchallenge.Dtos;

import com.sofkauchallenge.entities.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class DtoMapper {

    public Player fromPlayerDtoToEntity(PlayerDto playerDto) {
        Player player = new Player();

        player.setId(playerDto.getId());

        return player;
    }

    public PlayerDto fromEntityToPlayerDto(Player player) {
        PlayerDto playerDto = new PlayerDto();

        playerDto.setId(player.getId());

        return playerDto;
    }


    public Game fromGameDtoToEntity(GameDto gameDto) {
        Game game = new Game();
        Player player = fromPlayerDtoToEntity(gameDto.getUserName());

        game.setId(gameDto.getId());
        game.setCoins(gameDto.getCoins());
        game.setDate(gameDto.getDate());
        game.setResult(gameDto.getResult());
        game.setUserName(player);

        return game;
    }

    public GameDto fromEntityToGameDto(Game game) {
        GameDto gameDto = new GameDto();
        PlayerDto playerDto = fromEntityToPlayerDto(game.getUserName());

        gameDto.setId(game.getId());
        gameDto.setCoins(game.getCoins());
        gameDto.setDate(game.getDate());
        gameDto.setResult(game.getResult());
        gameDto.setUserName(playerDto);

        return gameDto;
    }


    public CategoryDto fromEntityToCategoryDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId(category.getId());
        categoryDto.setDifficulty(category.getDifficulty());
        categoryDto.setName(category.getName());
        return categoryDto;
    }

    public Category fromCategoryDtoToEntity(CategoryDto categoryDto) {
        Category category = new Category();

        category.setId(categoryDto.getId());
        category.setDifficulty(categoryDto.getDifficulty());
        category.setName(categoryDto.getName());

        return category;
    }


    public QuestionDto fromEntityToQuestionDto(Question question) {
        QuestionDto questionDto = new QuestionDto();
        CategoryDto categoryDto = fromEntityToCategoryDto(question.getCategory());

        questionDto.setId(question.getId());
        questionDto.setQuestion(question.getQuestion());
        questionDto.setCategory(categoryDto);

        return questionDto;
    }

    public Question fromQuestionDtoToEntity(QuestionDto questionDto) {
        Question question = new Question();
        Category category = fromCategoryDtoToEntity(questionDto.getCategory());

        question.setId(questionDto.getId());
        question.setQuestion(questionDto.getQuestion());
        question.setCategory(category);

        return question;
    }


    public Answer fromAnswerDtoToEntity(AnswerDto answerDto) {
        Answer answer = new Answer();
        Question question = fromQuestionDtoToEntity(answerDto.getQuestion());

        answer.setId(answerDto.getId());
        answer.setAnswer(answerDto.getAnswer());
        answer.setIsCorrect(answerDto.getIsCorrect());
        answer.setQuestion(question);

        return answer;
    }

    public AnswerDto fromEntityToAnswerDto(Answer answer) {
        AnswerDto answerDto = new AnswerDto();
        QuestionDto questionDto = fromEntityToQuestionDto(answer.getQuestion());

        answerDto.setId(answer.getId());
        answerDto.setAnswer(answer.getAnswer());
        answerDto.setIsCorrect(answer.getIsCorrect());
        answerDto.setQuestion(questionDto);

        return answerDto;
    }

    public RoundIdDto fromEntityToRoundIdDto(RoundId roundId) {
        RoundIdDto roundIdDto = new RoundIdDto();

        roundIdDto.setGameId(roundId.getGameId());
        roundIdDto.setCategoryId(roundId.getCategoryId());

        return roundIdDto;
    }

    public RoundId fromRounIdDtoToEntity(RoundIdDto roundIdDto) {
        RoundId roundId = new RoundId();

        roundId.setGameId(roundIdDto.getGameId());
        roundId.setCategoryId(roundIdDto.getCategoryId());

        return roundId;
    }

    public Round fromRoundDtoToEntity(RoundDto roundDto) {
        Round round = new Round();
        Category category = fromCategoryDtoToEntity(roundDto.getCategory());
        Game game = fromGameDtoToEntity(roundDto.getGame());
        RoundId roundId = fromRounIdDtoToEntity(roundDto.getId());

        round.setId(roundId);
        round.setCategory(category);
        round.setGame(game);
        round.setPrice(roundDto.getPrice());

        return round;
    }

    public RoundDto fromEntityToRounDto(Round round) {
        RoundDto roundDto = new RoundDto();
        CategoryDto categoryDto = fromEntityToCategoryDto(round.getCategory());
        GameDto gameDto = fromEntityToGameDto(round.getGame());
        RoundIdDto roundIdDto = fromEntityToRoundIdDto(round.getId());

        roundDto.setId(roundIdDto);
        roundDto.setCategory(categoryDto);
        roundDto.setGame(gameDto);
        roundDto.setPrice(round.getPrice());

        return roundDto;
    }

}
