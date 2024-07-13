package com.chabbah.gestiondestock.dto;


import com.chabbah.gestiondestock.model.Entreprise;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String telephone;

    private String siteWeb;

    @JsonIgnore
    private List<UserDto> users;

    public  EntrepriseDto fromEntity(Entreprise entreprise) {

        if (entreprise == null) {
            return null;
        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .telephone(entreprise.getTelephone())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public Entreprise toEntity(EntrepriseDto entrepriseDto) {

        if (entrepriseDto == null) {
            return null;
        }

        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setCodeFiscal(entrepriseDto.getCodeFiscal());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setTelephone(entrepriseDto.getTelephone());
        entreprise.setSiteWeb(entrepriseDto.getSiteWeb());

        return entreprise;

    }
}
