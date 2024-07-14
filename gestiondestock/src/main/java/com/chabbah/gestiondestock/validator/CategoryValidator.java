package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {
    public static List<String> validate(CategoryDto categoryDto) {
        List<String> errors = new ArrayList<String>();


        if(categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add("veuillez renseigner le code de la categorie");
        }
        return errors;
    }
}
