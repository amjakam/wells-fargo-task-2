package com.wellsfargo.counselor.entity;

import com.wellsfargo.counselor.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
