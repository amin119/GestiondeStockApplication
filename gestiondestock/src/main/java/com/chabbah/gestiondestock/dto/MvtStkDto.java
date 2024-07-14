package com.chabbah.gestiondestock.dto;


import com.chabbah.gestiondestock.model.MvtStock;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    public  MvtStkDto fromEntity(MvtStock mvtStock) {
        if(mvtStock==null) {
            return null;
        }
        return MvtStkDto.builder()
                .id(mvtStock.getId())
                .dateMvt(mvtStock.getDateMvt())
                .quantite(mvtStock.getQuantite())
                .article(ArticleDto.fromEntity(mvtStock.getArticle()))
                .build();

    }
    public MvtStock toEntity(MvtStkDto mvtStkDto) {

        if(mvtStkDto==null) {
            return null;
        }

        MvtStock mvtStock = new MvtStock();
        mvtStock.setId(mvtStkDto.getId());
        mvtStock.setArticle(ArticleDto.toEntity(mvtStkDto.getArticle()));
        mvtStock.setDateMvt(mvtStkDto.getDateMvt());
        mvtStock.setQuantite(mvtStkDto.getQuantite());

        return mvtStock;
    }


}
