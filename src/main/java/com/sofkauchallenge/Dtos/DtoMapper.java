package com.sofkauchallenge.Dtos;

import com.sofkauchallenge.entities.Game;
import com.sofkauchallenge.entities.Player;
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

}
