package com.chabbah.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDto {

    private Integer id;

    private String nom ;

    private String prenom ;

    private String email ;

    private String dateDeNaissance ;

    private String motDePasse ;

    private AdresseDto adresse ;

    private String photo;

    private EntrepriseDto entreprise ;

    private List<RolesDto> roles;
}
