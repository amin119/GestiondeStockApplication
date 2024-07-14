package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.LigneCommandeClientDto;


import java.util.ArrayList;
import java.util.List;

public class LigneCommandeClientValidator {
    public static List<String> validate(LigneCommandeClientDto ligneCommandeClientDto) {
        List<String> errors = new ArrayList<String>();
        if (ligneCommandeClientDto == null) {
            errors.add("veuillez renseigner l'article du cette ligne commande client");
            errors.add("veuillez renseigner la commande du cette ligne commande client");
            errors.add("veuillez renseigner le prix unitaire du cette ligne commande client");
            errors.add("veuillez renseigner la quantité de cette ligne commande client");
            return errors;
        }
        if(ligneCommandeClientDto.getArticle() == null){
            errors.add("veuillez renseigner l'article du cette ligne commande client");
        }
        if(ligneCommandeClientDto.getCommandeClient()==null){
            errors.add("veuillez renseigner la commande du cette ligne commande client");
        }
        if(ligneCommandeClientDto.getPrixUnitaire() == null){
            errors.add("veuillez renseigner le prix unitaire du cette ligne commande client");
        }
        if(ligneCommandeClientDto.getQuantity() == null){
            errors.add("veuillez renseigner la quantité de cette ligne commande client");
        }
        return errors;
    }
}
