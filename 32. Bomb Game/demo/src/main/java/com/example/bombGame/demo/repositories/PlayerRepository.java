package com.example.bombGame.demo.repositories;

import com.example.bombGame.demo.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
