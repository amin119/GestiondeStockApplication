package com.chabbah.gestiondestock.dto;

import com.chabbah.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

    private String adresse1;

    private String adresse2;

    private String ville;

    private String postalCode;

    private String city;

    public AdresseDto fromEntity(Adresse adresse) {

      if (adresse == null) {
          return null;
      }
      return AdresseDto.builder()
              .adresse1(adresse.getAdresse1())
              .adresse2(adresse.getAdresse2())
              .ville(adresse.getVille())
              .postalCode(adresse.getPostalCode())
              .city(adresse.getCity())
              .build();
    }

    public Adresse toEntity(AdresseDto adresseDto) {

        if (adresseDto == null) {
            return null;
        }

        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getVille());
        adresse.setPostalCode(adresseDto.getPostalCode());
        adresse.setCity(adresseDto.getCity());

        return adresse;

    }
}
