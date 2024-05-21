package com.wellsfargo.counselor.entity;

import com.wellsfargo.counselor.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByLastName(String lastName);
}
