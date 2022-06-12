package com.sofkauchallenge.controllers;

import com.sofkauchallenge.Dtos.GameDto;
import com.sofkauchallenge.Dtos.PlayerDto;
import com.sofkauchallenge.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/login")
    public PlayerDto logIn(@RequestBody PlayerDto playerDto) {
        return playerService.logIn(playerDto);
    }

    @PostMapping("/games")
    public List<GameDto> listAllGamesByPlayer(@RequestBody PlayerDto playerDto) {
        return playerService.listAllGamesByPlayer(playerDto);
    }

    @GetMapping("/all")
    public List<PlayerDto> listAllPlayers() {
        return playerService.listAllPlayers();
    }

}
