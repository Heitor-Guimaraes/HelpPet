package com.senai.pet.service;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.Entity.Pet;
import com.senai.pet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


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
        return petRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pet nao encontrado"));
    }

    public List<Pet> listarTodos(){
        return petRepository.findAll();
    }

    public Pet atualizar(Long id, PetDTO petDTO){
        Pet pet = buscarPorId(id);
        pet.setNome(petDTO.getNome());
        pet.setIdade(petDTO.getIdade());
        pet.setPorte(petDTO.getPorte());
        pet.setTipo(petDTO.getTipo());
        pet.setRaca(petDTO.getRaca());
        return petRepository.save(pet);
    }

    public void deletar(Long id){
        petRepository.deleteById(id);
    }

}
