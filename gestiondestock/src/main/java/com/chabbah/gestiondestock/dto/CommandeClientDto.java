package com.chabbah.gestiondestock.dto;

import com.chabbah.gestiondestock.model.CommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant date;

    private ClientDto client;

    @JsonIgnore
    private List<LigneCommandeClientDto> ligneCommandeClients;

    public static CommandeClientDto fromEntity(CommandeClient commandeClient) {

        if (commandeClient == null) {
            return null;
        }

        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .date(commandeClient.getDate())
                .client(ClientDto.fromEntity(commandeClient.getClient()))
                .build();
    }

    public static CommandeClient toEntity(CommandeClientDto commandeClientDto) {

        if (commandeClientDto == null) {
            return null;
        }

        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDate(commandeClientDto.getDate());
        commandeClient.setClient(ClientDto.toEntity(commandeClientDto.getClient()));

        return commandeClient;
    }
}
