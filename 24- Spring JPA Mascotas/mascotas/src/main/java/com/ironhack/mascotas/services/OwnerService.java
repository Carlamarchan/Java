package com.ironhack.mascotas.services;

import com.ironhack.mascotas.entities.Owner;
import com.ironhack.mascotas.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    //Obtener todos Owners
    public List<Owner> getAll(){
        return ownerRepository.findAll();
    }

    //Obtener Owner by ID
    public Optional<Owner> findById(Long id){
        return ownerRepository.findById(id);
    }

    //Save Owner
    public Owner saveOwner(Owner owner){
       return ownerRepository.save(owner);
    }

    //Delete Owner
    public  void deleteOwner(Long id){
        ownerRepository.deleteById(id);
    }
}
