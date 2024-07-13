package com.chabbah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @Column(name="nom")
    private String nom ;

    @Column(name="prenom")
    private String prenom ;

    @Column(name="email")
    private String email ;

    @Column(name = "datedenaissance")
    private String dateDeNaissance ;

    @Column(name="motdepasse")
    private String motDePasse ;

    @Embedded
    private Adresse adresse ;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name ="identreprise")
    private Entreprise entreprise ;

    @OneToMany(mappedBy = "user")
    private List<Roles> roles;
}
