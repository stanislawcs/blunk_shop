package com.example.blunk.code.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    @NotBlank
    private String name;
    @NotBlank
    private String tgUsername;
    @NotBlank
    @Size(min = 8, max = 20)
    private String password;
}
