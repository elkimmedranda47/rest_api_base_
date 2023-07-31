package com.example.demo.repositories;

import com.example.demo.models.ColaboradorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends CrudRepository<ColaboradorModel, Long> {}
