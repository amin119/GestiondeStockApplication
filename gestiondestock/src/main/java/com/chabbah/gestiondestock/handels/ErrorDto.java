package com.chabbah.gestiondestock.handels;


import com.chabbah.gestiondestock.exception.ErrorCode;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {

    private Integer httpCode;

    private ErrorCode code;

    private String message;

    private List<String> errors = new ArrayList<>();

}
