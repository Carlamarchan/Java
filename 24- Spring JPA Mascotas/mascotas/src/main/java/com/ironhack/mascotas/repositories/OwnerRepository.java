package com.ironhack.mascotas.repositories;

import com.ironhack.mascotas.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository <Owner,Long> {

}
