package com.chabbah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import javax.management.relation.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity{

    @Column(name = "rolename")
    private String rolename;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;
}
