package com.senai.pet.service;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PetService {

    private PetRepository petRepository;

    public PetService(@Autowired PetRepository petRepository) {

        this.petRepository = petRepository;

    }

    public PetDTO mostrar(){
        return
    }

}
