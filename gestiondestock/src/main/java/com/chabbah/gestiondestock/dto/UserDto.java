package com.chabbah.gestiondestock.dto;

import com.chabbah.gestiondestock.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDto {

    private Integer id;

    private String nom ;

    private String prenom ;

    private String email ;

    private String dateDeNaissance ;

    private String motDePasse ;

    private AdresseDto adresse ;

    private String photo;

    private EntrepriseDto entreprise ;

    @JsonIgnore
    private List<RolesDto> roles;

    public static UserDto fromEntity(User user) {
        if (user == null) {
            return null;
        }

        return UserDto.builder()
                .id(user.getId())
                .nom(user.getNom())
                .prenom(user.getPrenom())
                .email(user.getEmail())
                .dateDeNaissance(user.getDateDeNaissance())
                .motDePasse(user.getMotDePasse())
                .adresse(AdresseDto.fromEntity(user.getAdresse()))
                .photo(user.getPhoto())

                .build();
    }

    public static User toEntity(UserDto userDto) {
        if (userDto == null) {
            return null;
        }
        User user = new User();
        user.setId(userDto.getId());
        user.setNom(userDto.getNom());
        user.setPrenom(userDto.getPrenom());
        user.setEmail(userDto.getEmail());
        user.setDateDeNaissance(userDto.getDateDeNaissance());
        user.setMotDePasse(userDto.getMotDePasse());
        user.setAdresse(AdresseDto.toEntity(userDto.getAdresse()));
        user.setPhoto(userDto.getPhoto());

        return user;
    }
}
