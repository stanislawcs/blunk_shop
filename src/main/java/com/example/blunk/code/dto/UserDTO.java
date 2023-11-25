package com.example.blunk.code.dto;

import com.example.blunk.code.dto.validation.OnUpdate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    @NotBlank(message = "Id should not be null", groups = OnUpdate.class)
    private Long id;
    @NotBlank(message = "Should not be null, or empty")
    private String name;
    @NotBlank(message = "Username should not be empty")
    private String tgUsername;

    @NotBlank
    @Size(min = 8, max = 20)
    private String password;
}
