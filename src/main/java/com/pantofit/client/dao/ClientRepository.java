package com.pantofit.client.dao;

import com.pantofit.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findClientByEmail(String email);
}
