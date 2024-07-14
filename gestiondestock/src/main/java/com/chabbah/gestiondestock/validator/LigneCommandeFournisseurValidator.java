package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.LigneCommandeFournisseurDto;


import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {
    public static List<String> validate(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
        List<String> errors = new ArrayList<String>();
        if (ligneCommandeFournisseurDto == null) {
            errors.add("veuillez renseigner l'article du cette ligne commande fournisseur");
            errors.add("veuillez renseigner la commande du cette ligne commande fournisseur");
            errors.add("veuillez renseigner le prix unitaire du cette ligne commande fournisseur");
            errors.add("veuillez renseigner la quantité de cette ligne commande fournisseur");
            return errors;
        }
        if(ligneCommandeFournisseurDto.getArticle() == null){
            errors.add("veuillez renseigner l'article du cette ligne commande fournisseur");
        }
        if(ligneCommandeFournisseurDto.getCommandeFournisseur()==null){
            errors.add("veuillez renseigner la commande du cette ligne commande fournisseur");
        }
        if(ligneCommandeFournisseurDto.getPrixUnitaire() == null){
            errors.add("veuillez renseigner le prix unitaire du cette ligne commande fournisseur");
        }
        if(ligneCommandeFournisseurDto.getQuantity() == null){
            errors.add("veuillez renseigner la quantité de cette ligne commande fournisseur");
        }
        return errors;
    }
}
