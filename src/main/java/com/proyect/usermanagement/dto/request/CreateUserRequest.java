package com.proyect.usermanagement.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
<<<<<<< HEAD

=======
>>>>>>> ac9deff (depure code)
public class CreateUserRequest {

    @NotBlank
    private String username;

    @Email
    private String email;

    @NotBlank
    private String password;
<<<<<<< HEAD
}
=======
}
>>>>>>> ac9deff (depure code)
