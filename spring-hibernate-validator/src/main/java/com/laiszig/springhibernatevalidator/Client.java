package com.laiszig.springhibernatevalidator;

import com.laiszig.springhibernatevalidator.validator.constraints.CarPlate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class Client {

    private Integer id;
    @NotBlank (message = "Missing Field")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "Must start with capital letter")
    private String name;
    @Email
    private String email;
    @CPF
    private String cpf;
    @NotBlank
    @CarPlate
    private String carPlate;
    @Min(value = 1900, message = "Must be greater than 1900")
    private int birthYear;
}
