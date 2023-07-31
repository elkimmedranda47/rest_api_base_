package com.example.demo.repositories;

import com.example.demo.models.MascotaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends CrudRepository<MascotaModel, Long> {
}





