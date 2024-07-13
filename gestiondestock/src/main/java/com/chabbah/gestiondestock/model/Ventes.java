package com.chabbah.gestiondestock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vente")
public class Ventes extends AbstractEntity {

    // FIXME
    private String code;
}
