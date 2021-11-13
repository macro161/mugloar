package com.mugloar.service.impl;

import com.mugloar.data.Game;
import com.mugloar.repository.impl.GameRepositoryLocal;
import com.mugloar.service.GameService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.inject.Singleton;
import java.util.Random;

@Singleton
@AllArgsConstructor
public class GameServiceImpl implements GameService {

    @Override
    public Game startGame() {
        String id = Integer.toString(new Random().nextInt(99999999));
        Game game = new Game("sd", 3, 0, 0, 0, 0, 0);
        GameRepositoryLocal.games.add(game);
        return game;
    }
}
