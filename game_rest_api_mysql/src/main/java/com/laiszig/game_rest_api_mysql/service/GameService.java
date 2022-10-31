package com.laiszig.game_rest_api_mysql.service;

import com.laiszig.game_rest_api_mysql.entity.Game;

import java.util.List;

public interface GameService {

    Game saveGame(Game game);

    List<Game> getAllGames();

    Game getGameById(Long id);
}


