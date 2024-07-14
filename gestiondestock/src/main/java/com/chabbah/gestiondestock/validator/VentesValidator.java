package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.VentesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VentesValidator {
    public static List<String> validate(VentesDto ventesDto) {
        List<String> errors = new ArrayList<String>();
        if (ventesDto == null || !StringUtils.hasLength(ventesDto.getCode())) {
            errors.add("le code du vente est obligatoire");
        }
        return errors;
    }
}
