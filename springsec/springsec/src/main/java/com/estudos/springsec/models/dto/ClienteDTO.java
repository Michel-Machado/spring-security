package com.estudos.springsec.models.dto;

import com.estudos.springsec.models.ClienteModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    @NotBlank
    @NotEmpty
    private String nome;

    @Email
    @NotEmpty
    private String email;

    public ClienteDTO(ClienteModel clienteModel) {
        nome = clienteModel.getNome();
        email = clienteModel.getEmail();
    }
}