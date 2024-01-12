package com.estudos.springsec.services;

import com.estudos.springsec.models.ClienteModel;
import com.estudos.springsec.models.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
    List<ClienteDTO> getAllClientes();


    ClienteDTO getClienteById(Long id);

    void deleteClienteByid(Long id);

    ClienteDTO cadastraCliente(ClienteModel clientModel);

    ClienteDTO alteraCliente(ClienteModel clienteModel);
}
