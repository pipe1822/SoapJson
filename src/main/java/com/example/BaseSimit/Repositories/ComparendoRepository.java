package com.example.BaseSimit.Repositories;

import com.example.BaseSimit.models.Comparendo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource
public interface ComparendoRepository extends JpaRepository<Comparendo,Integer> {
}
