package com.estudos.springsec.services.impl;

import com.estudos.springsec.models.ClienteModel;
import com.estudos.springsec.models.dto.ClienteDTO;
import com.estudos.springsec.repositories.ClienteRepository;
import com.estudos.springsec.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> getAllClientes() {

        List<ClienteModel> clienteModels =  clienteRepository.findAll();
        return  clienteModels.stream().map(ClienteDTO::new).toList();
    }

    @Override
    public ClienteDTO getClienteById(Long id) {
        Optional<ClienteModel> clienteModel= clienteRepository.findById(id);
        if (clienteModel.isEmpty()){
            throw new RuntimeException("Cliente não encontrado");
        }
        return new ClienteDTO(clienteModel.get());
    }

    @Override
    public void deleteClienteByid(Long id) {
        Optional<ClienteModel> clienteModel= clienteRepository.findById(id);
        if (clienteModel.isEmpty()){
            throw new RuntimeException("Cliente não encontrado");
        }
        clienteRepository.deleteById(id);
    }

    @Override
    public ClienteDTO cadastraCliente(ClienteModel clienteModel) {
        return new ClienteDTO(clienteRepository.save(clienteModel));

    }
    @Override
    public ClienteDTO alteraCliente(ClienteModel clienteModel){

        return new ClienteDTO( clienteRepository.save(clienteModel));
    }


}
