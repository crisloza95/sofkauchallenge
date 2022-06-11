package com.sofkauchallenge.services;

import com.sofkauchallenge.Dtos.DtoMapper;
import com.sofkauchallenge.Dtos.GameDto;
import com.sofkauchallenge.Dtos.PlayerDto;
import com.sofkauchallenge.entities.Player;
import com.sofkauchallenge.repositories.GameRepository;
import com.sofkauchallenge.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    GameRepository gameRepository;
    @Autowired
    DtoMapper dtoMapper;

    @Override
    public List<PlayerDto> listAllPlayers() {
        List<PlayerDto> playerDtos = new ArrayList<>();

        playerRepository
                .findAll()
                .forEach(player -> playerDtos.add(dtoMapper.fromEntityToPlayerDto(player)));

        return playerDtos;
    }

    @Override
    public List<GameDto> listAllGamesByPlayer(PlayerDto playerDto) {
        List<GameDto> gameDtos = new ArrayList<>();
        List<GameDto> gameDtosByPlayer;

        gameRepository
                .findAll()
                .forEach(game -> gameDtos.add(dtoMapper.fromEntityToGameDto(game)));
        gameDtosByPlayer = gameDtos
                .stream()
                .filter(gameDto -> gameDto.getUserName().equals(playerDto)).toList();

        return gameDtosByPlayer;
    }

    @Override
    public Player logIn(PlayerDto playerDto) {
        Player player = dtoMapper.fromPlayerDtoToEntity(playerDto);

        playerRepository.save(player);

        return player;
    }

}
