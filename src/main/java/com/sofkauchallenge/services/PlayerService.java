package com.sofkauchallenge.services;

import com.sofkauchallenge.Dtos.GameDto;
import com.sofkauchallenge.Dtos.PlayerDto;
import com.sofkauchallenge.entities.Player;

import java.util.List;

public interface PlayerService {
    List<PlayerDto> listAllPlayers();

    List<GameDto> listAllGamesByPlayer(PlayerDto playerDto);

    PlayerDto logIn(PlayerDto playerDto);

}
