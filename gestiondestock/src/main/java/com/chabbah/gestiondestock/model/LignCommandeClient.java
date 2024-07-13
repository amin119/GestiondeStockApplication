package com.chabbah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecoammandeclient")
public class LignCommandeClient extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idcommandeclient")
    private CommandeClient commandeClient;

    @Column(name="quantity")
    private BigDecimal quantity;

    @Column(name="prixunitaire")
    private BigDecimal prixUnitaire;
}
