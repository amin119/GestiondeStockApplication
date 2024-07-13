package com.chabbah.gestiondestock.dto;

import com.chabbah.gestiondestock.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles ;

    public CategoryDto fromEntity(Category category) {

        if (category == null)  {
            return null;
            //TODO throw an exception
        }
        // Category -> CategoryDto
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();

    }

    public Category toEntity(CategoryDto categoryDto) {
        if (categoryDto == null)  {
            return null;
            //TODO throw an exception

        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());

        return category;
    }
}
