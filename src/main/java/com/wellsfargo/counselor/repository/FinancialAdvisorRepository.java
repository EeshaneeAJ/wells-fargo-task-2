package com.wellsfargo.counselor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.counselor.entity.FinancialAdvisor;

public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> {}
