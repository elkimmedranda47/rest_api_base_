package com.example.demo.repositories;

import com.example.demo.models.HistoriadetalleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriadetalleRepository extends JpaRepository<HistoriadetalleModel, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
