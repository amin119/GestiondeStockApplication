package com.chabbah.gestiondestock.dto;


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


}
