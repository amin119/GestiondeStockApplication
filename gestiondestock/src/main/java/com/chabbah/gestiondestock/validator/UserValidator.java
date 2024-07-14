package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.UserDto;
import com.chabbah.gestiondestock.model.User;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public static List<String> validate(UserDto userDto) {
        List<String> errors = new ArrayList<String>();

        if (userDto == null) {
            errors.add("veuillez renseigner le nom de l'utilisateur");
            errors.add("veuillez renseigner le prenom de l'utilisateur");
            errors.add("veuillez renseigner le mot de passe de l'utilisateur");
            errors.add("veuillez renseigner l'email de l'utilisateur");
            errors.add("veuillez renseigner l'adresse de l'utilisateur");
            return errors;
        }

        if (!StringUtils.hasLength(userDto.getNom())) {
            errors.add("veuillez renseigner le nom de l'utilisateur");
        }
        if (!StringUtils.hasLength(userDto.getPrenom())) {
            errors.add("veuillez renseigner le prenom de l'utilisateur");
        }
        if (!StringUtils.hasLength(userDto.getMotDePasse())) {
            errors.add("veuillez renseigner le mot de passe de l'utilisateur");
        }
        if (userDto.getDateDeNaissance()==null){
            errors.add("veuillez renseigner le mot de passe de l'utilisateur");
        }
        if (!StringUtils.hasLength(userDto.getEmail())) {
            errors.add("veuillez renseigner l'email de l'utilisateur");
        }
        if (userDto.getAdresse()== null) {
            errors.add("veuillez renseigner l'adresse de l'utilisateur");
        } else {
            if (!StringUtils.hasLength(userDto.getAdresse().getAdresse1())) {
                errors.add("Le champs 'adresse1' est obligatoire");
            }
            if (!StringUtils.hasLength(userDto.getAdresse().getVille())) {
                errors.add("Le champs 'ville' est obligatoire");
            }
            if (!StringUtils.hasLength(userDto.getAdresse().getPostalCode())) {
                errors.add("Le champs 'code postal' est obligatoire");
            }
            if (!StringUtils.hasLength(userDto.getAdresse().getCity())) {
                errors.add("Le champs 'pays' est obligatoire");
            }
        }
        return errors;
    }
}
