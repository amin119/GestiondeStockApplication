package com.chabbah.gestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity {

    @Column(name="code")
    private String code;

    @Column(name="date")
    private Instant date;

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LignCommandeClient> ligneCommandeClients;
}
