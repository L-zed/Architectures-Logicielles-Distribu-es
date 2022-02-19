package com.example.tripadvisor.repositories;

import com.example.tripadvisor.model.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
}
