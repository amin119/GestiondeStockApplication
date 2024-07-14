package com.chabbah.gestiondestock.validator;

import com.chabbah.gestiondestock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto) {
        List<String> errors = new ArrayList<String>();

        if (articleDto == null){
            errors.add(" veuillez rensigner le Code de l'article");
            errors.add("vuillez rensignez la Designation de l'article");
            errors.add("veuillez rensigner le prix untiaire HT de l'article");
            errors.add("veuillez rensigner le taux de TVA de l'article");
            errors.add("veuillez rensigner le prix unitaire TTC de l'article");
            errors.add("veuillez selectionner une categorie");
            return errors;
        }
        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add(" veuillez rensigner le Code de l'article");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("vuillez rensignez la Designation de l'article");
        }
        if(articleDto.getPrixUnitaireHt()==null){
            errors.add("veuillez rensigner le prix untiaire HT de l'article");
        }
        if(articleDto.getTauxTva()==null){
            errors.add("veuillez rensigner le taux de TVA de l'article");
        }
        if(articleDto.getPrixUnitaireTtc()==null){
            errors.add("veuillez rensigner le prix unitaire TTC de l'article");
        }
        if(articleDto.getCategory()==null){
            errors.add("veuillez selectionner une categorie");
        }
    return errors;
    }

}
