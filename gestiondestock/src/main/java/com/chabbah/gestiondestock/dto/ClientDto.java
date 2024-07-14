package com.chabbah.gestiondestock.dto;

import com.chabbah.gestiondestock.model.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String telephone;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client) {
        if (client==null) {
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(AdresseDto.fromEntity(client.getAdresse()))
                .photo(client.getPhoto())
                .email(client.getEmail())
                .telephone(client.getTelephone())
                .build();
    }
    public static Client toEntity(ClientDto clientDto) {

        if (clientDto==null) {
            return null;
        }

        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setAdresse(AdresseDto.toEntity(clientDto.getAdresse()));
        client.setPhoto(clientDto.getPhoto());
        client.setEmail(clientDto.getEmail());
        client.setTelephone(clientDto.getTelephone());

        return client;


    }
}
