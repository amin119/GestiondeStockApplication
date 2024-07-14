package com.chabbah.gestiondestock.validator;


import com.chabbah.gestiondestock.dto.CommandeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeFournisseurValidator {
    public static List<String> validate (CommandeFournisseurDto commandeFournisseurDto) {
        List<String> errors = new ArrayList<String>();
        if (commandeFournisseurDto == null) {
            errors.add(" veuillez rensigner le Code du commande fournisseur");
            errors.add(" veuillez rensigner le Date du commande fournisseur");
            errors.add("veuillez renseigner le fournisseur du cette commande ");
            return errors;
        }
        if (!StringUtils.hasLength(commandeFournisseurDto.getCode())) {
            errors.add(" veuillez rensigner le Code du commande fournisseur");
        }
        if(commandeFournisseurDto.getDateCommade()==null){
            errors.add(" veuillez rensigner le Date du commande fournisseur");
        }
        if(commandeFournisseurDto.getFournisseur()==null){
            errors.add("veuillez renseigner le fournisseur du cette commande ");
        }
        return errors;
    }
}

