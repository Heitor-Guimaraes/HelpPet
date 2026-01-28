package com.senai.pet.DTO;

import com.senai.pet.Entity.Pet;
import com.senai.pet.enums.Porte;
import com.senai.pet.enums.TIpo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PetDTO {
    @NotBlank
    private String nome;
    @NotNull
    private int idade;
    private String raca;

    private Porte porte;

    private TIpo tipo;

    public PetDTO(Pet pet) {
        this.nome = pet.getNome();
        this.idade = pet.getIdade();
        this.raca = pet.getRaca();
        this.porte = pet.getPorte();
        this.tipo = pet.getTipo();
    }



}

