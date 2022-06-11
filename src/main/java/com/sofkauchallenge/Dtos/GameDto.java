package com.sofkauchallenge.Dtos;

import lombok.Data;

import java.time.Instant;

@Data
public class GameDto {
    private Integer id;
    private Instant date;
    private String result;
    private PlayerDto userName;
    private Integer coins;
}
