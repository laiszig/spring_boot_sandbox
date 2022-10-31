package com.laiszig.game_rest_api_mysql.service.impl;

import com.laiszig.game_rest_api_mysql.entity.Game;
import com.laiszig.game_rest_api_mysql.repository.GameRepository;
import com.laiszig.game_rest_api_mysql.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
}

/*
1. Setter-based dependency injection: whenever we have optional parameters
2. Constructor-based dependency injection: whenever we have mandatory parameters

Since Spring 4.3, if a class, which is configured as a Spring bean, has only one constructor,
the @Autowired annotation can me omitted and Spring will use that constructor and inject all necessary dependencies
 */


