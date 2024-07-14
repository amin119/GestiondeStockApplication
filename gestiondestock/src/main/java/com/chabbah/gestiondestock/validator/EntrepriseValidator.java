package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.EntrepriseDto;
import com.chabbah.gestiondestock.dto.UserDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {
    public static List<String> validate(EntrepriseDto entrepriseDto) {
        List<String> errors = new ArrayList<String>();

        if (entrepriseDto == null) {
            errors.add("veuillez renseigner le nom de l'entreprise");
            errors.add("veuillez renseigner le code fiscal de l'entreprise");
            errors.add("veuillez renseigner l'email de l'entreprise");
            errors.add("veuillez renseigner le numero de telephone de l'entreprise");
            errors.add("veuillez renseigner l'adresse de l'entreprise");
            return errors;
        }

        if (!StringUtils.hasLength(entrepriseDto.getNom())) {
            errors.add("veuillez renseigner le nom de l'entreprise");
        }
        if (!StringUtils.hasLength(entrepriseDto.getCodeFiscal())) {
            errors.add("veuillez renseigner le code fiscal de l'entreprise");
        }
        if (!StringUtils.hasLength(entrepriseDto.getEmail())) {
            errors.add("veuillez renseigner l'email de l'entreprise");
        }
        if (entrepriseDto.getTelephone()==null){
            errors.add("veuillez renseigner le numero de telephone de l'entreprise");
        }
        if (entrepriseDto.getAdresse()== null) {
            errors.add("veuillez renseigner l'adresse de l'utilisateur");
        } else {
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getAdresse1())) {
                errors.add("Le champs 'adresse1' est obligatoire");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getVille())) {
                errors.add("Le champs 'ville' est obligatoire");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getPostalCode())) {
                errors.add("Le champs 'code postal' est obligatoire");
            }
            if (!StringUtils.hasLength(entrepriseDto.getAdresse().getCity())) {
                errors.add("Le champs 'pays' est obligatoire");
            }
        }
        return errors;
    }
}
