package com.example.BaseSimit.Controllers;

import com.example.BaseSimit.Repositories.ClienteRepository;
import com.example.BaseSimit.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteRepository.findAll();
    }
    @GetMapping("/clientes/{id}")
    public Optional<Cliente> getCliente(@PathVariable Integer id){
        return clienteRepository.findById(id);
    }
}
