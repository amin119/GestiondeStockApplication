package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.MvtStkDto;

import java.util.ArrayList;
import java.util.List;

public class MvtStkValidator {
    public static List<String> validate(MvtStkDto mvtStkDto){
        List<String> errors = new ArrayList<String>();
        if(mvtStkDto == null){
            errors.add("veuillez rensigner la quantité de ce mvt stock");
            errors.add("veuillez rensigner la article de ce mvt stock");
            return errors;
        }
        if(mvtStkDto.getQuantite()==null){
            errors.add("veuillez rensigner la quantité de ce mvt stock");
        }
        if(mvtStkDto.getArticle()==null){
            errors.add("veuillez rensigner la article de ce mvt stock");
        }
        return errors;
    }
}
