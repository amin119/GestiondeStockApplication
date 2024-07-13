package com.chabbah.gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse {

    @Column(name="adresses1")
    private String adresse1;

    @Column(name="adresse2")
    private String adresse2;

    @Column(name="ville")
    private String ville;

    @Column(name="codepostale")
    private String postalCode;

    @Column(name="pays")
    private String city;
}

