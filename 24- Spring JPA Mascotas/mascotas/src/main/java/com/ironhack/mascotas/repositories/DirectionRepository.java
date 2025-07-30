package com.ironhack.mascotas.repositories;

import com.ironhack.mascotas.entities.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionRepository extends JpaRepository<Direction, Long> {
}

