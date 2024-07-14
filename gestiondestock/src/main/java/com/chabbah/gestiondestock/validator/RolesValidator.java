package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.RolesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RolesValidator {
    public static List<String> validate(RolesDto rolesDto){
        List<String> errors = new ArrayList<String>();
        if(rolesDto == null){
            errors.add("le nom de votre user est obligatoire");
            errors.add("le nom de votre role est obligatoire");
            return errors;
        }
        if(!StringUtils.hasLength(rolesDto.getRolename())){
            errors.add("le nom de votre role est obligatoire");
        }
        if(rolesDto.getUser() == null ){
            errors.add("le nom de votre user est obligatoire");
        }
        return errors;
    }
}
