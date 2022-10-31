package com.laiszig.game_rest_api_mysql.repository;

import com.laiszig.game_rest_api_mysql.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
