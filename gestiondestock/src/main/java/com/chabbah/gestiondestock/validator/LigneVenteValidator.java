package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.LigneVenteDto;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {
    public static List<String> validate(LigneVenteDto ligneVenteDto) {
        List<String> errors = new ArrayList<String>();
        if (ligneVenteDto == null) {
            errors.add("Veuillez renseinger votre vente");
            errors.add(" Veuillez rensigner le Prix unitaire de cette ligne commande");
            errors.add(" Veuillez rensigner la quantité de cette ligne commande");
            return errors;
        }
        if (ligneVenteDto.getVente() == null) {
            errors.add("Veuillez renseinger votre vente");
        }
        if(ligneVenteDto.getPrixUnitaire() == null){
            errors.add(" Veuillez rensigner le Prix unitaire de cette ligne commande");
        }
        if(ligneVenteDto.getQuantity() == null){
            errors.add(" Veuillez rensigner la quantité de cette ligne commande");
        }

        return errors;
    }
}
