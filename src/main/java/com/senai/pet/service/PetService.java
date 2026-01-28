package com.senai.pet.service;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.Entity.Pet;
import com.senai.pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PetService {

    private PetRepository petRepository;

    public PetService(@Autowired PetRepository petRepository) {

        this.petRepository = petRepository;

    }

    public String salvar(PetDTO petDTO){
        Pet pet = new Pet(petDTO.getNome(),petDTO.getIdade(),petDTO.getPorte(), petDTO.getTipo(),petDTO.getRaca());
        petRepository.save(pet);
        return "Salvo com sucesso";
    }

    public Pet buscarPorId(Long id){
        return petRepository.findById(id).get();
    }



}
