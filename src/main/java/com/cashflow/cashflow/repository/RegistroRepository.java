package com.cashflow.cashflow.repository;

import com.cashflow.cashflow.model.RegistroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroModel, Long> {
}
