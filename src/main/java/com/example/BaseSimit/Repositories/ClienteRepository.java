package com.example.BaseSimit.Repositories;

import com.example.BaseSimit.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
