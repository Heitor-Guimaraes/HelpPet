package com.senai.pet.Controller;


import com.senai.pet.DTO.PetDTO;
import com.senai.pet.service.PetService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pet")
public class PetController {

    private PetService petService;

    public PetController(PetService petService){

        this.petService = petService;

    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> savePet(@RequestBody @Valid PetDTO petDTO){
        petService.salvar(petDTO);
        return ResponseEntity.ok("Salvo");

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findPetById(@PathVariable Long id){
        return ResponseEntity.ok(petService.buscarPorId(id));
    }




}
