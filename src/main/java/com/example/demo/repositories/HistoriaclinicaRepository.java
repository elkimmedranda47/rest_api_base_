package com.example.demo.repositories;

import com.example.demo.models.HistoriaclinicaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaclinicaRepository extends CrudRepository<HistoriaclinicaModel, Long> {}
