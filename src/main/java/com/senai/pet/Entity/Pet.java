package com.senai.pet.Entity;

import com.senai.pet.enums.Porte;
import com.senai.pet.enums.TIpo;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="tb_pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;
    private String raca;
    private Porte porte;
    private TIpo tipo;

}
