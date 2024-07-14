package com.chabbah.gestiondestock.dto;


import com.chabbah.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private VentesDto vente ;

    private BigDecimal quantity;

    private BigDecimal prixUnitaire;

    public LigneVenteDto fromEntity(LigneVente ligneVente) {

        if (ligneVente == null) {
            return null;
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .vente(VentesDto.fromEntity(ligneVente.getVente()))
                .quantity(ligneVente.getQuantity())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }

    public LigneVente toEntity(LigneVenteDto ligneVenteDto) {
        if (ligneVenteDto == null) {
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setVente(VentesDto.toEntity(ligneVenteDto.getVente()));
        ligneVente.setQuantity(ligneVenteDto.getQuantity());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());

        return ligneVente;
    }
}
