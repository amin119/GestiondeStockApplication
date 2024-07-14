package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {
    public static List<String> validate (CommandeClientDto commandeClientDto) {
        List<String> errors = new ArrayList<String>();
        if (commandeClientDto == null) {
            errors.add(" veuillez rensigner le Code du commande client");
            errors.add(" veuillez rensigner le Date du commande client");
            errors.add("veuillez renseigner le client du cette commande ");
            return errors;
        }
        if (!StringUtils.hasLength(commandeClientDto.getCode())) {
            errors.add(" veuillez rensigner le Code du commande client");
        }
        if(commandeClientDto.getDate()==null){
            errors.add(" veuillez rensigner le Date du commande client");
        }
        if(commandeClientDto.getClient()==null){
            errors.add("veuillez renseigner le client du cette commande ");
        }
        return errors;
    }
}


