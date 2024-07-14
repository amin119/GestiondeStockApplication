package com.chabbah.gestiondestock.dto;

import com.chabbah.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String rolename;

    private UserDto user;

    public RolesDto fromEntity(Roles roles){

        if (roles == null) {
            return null;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .rolename(roles.getRolename())
                .user(UserDto.fromEntity(roles.getUser()))
                .build();
    }

    public Roles toEntity(RolesDto rolesDto){
        if (rolesDto == null) {
            return null;
        }
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRolename(rolesDto.getRolename());
        roles.setUser(UserDto.toEntity(rolesDto.getUser()));
        return roles;
    }
}
