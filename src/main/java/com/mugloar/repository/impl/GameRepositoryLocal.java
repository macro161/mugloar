package com.mugloar.repository.impl;

import com.mugloar.data.Game;
import com.mugloar.repository.GameRepository;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class GameRepositoryLocal implements GameRepository {

    public static List<Game> games = new ArrayList<>();
}
