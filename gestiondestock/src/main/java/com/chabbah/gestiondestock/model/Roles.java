package com.chabbah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import javax.management.relation.Role;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity{

    @Column(unique = true, nullable = false)
    private String rolename;

    @ManyToOne
    @JoinColumn(name = "iduser")
    private User user;
}
