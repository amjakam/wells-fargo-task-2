package com.wellsfargo.counselor.entity;


import com.wellsfargo.counselor.entity.Advisor;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AdvisorRepository extends CrudRepository<Advisor, Long> {
    List<Advisor> findByLastName(String lastName);
}
