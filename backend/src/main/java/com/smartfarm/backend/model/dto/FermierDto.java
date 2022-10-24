package com.smartfarm.backend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FermierDto {
    private String id;
    private String nom;
    private String email;
    private String motDePasse;
    private Long telephone;
    private LocalisationDto localisationDto;
}
