package com.mugloar.controller;

import com.mugloar.data.Game;
import com.mugloar.service.GameService;
import com.mugloar.service.impl.GameServiceImpl;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import lombok.AllArgsConstructor;

import javax.inject.Inject;

@Controller("/game/start")
@AllArgsConstructor
public class GameController {

    private final GameService gameService;

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    public Game start() {
        return gameService.startGame();
    }
}
