package com.example.agencyService2.repositories;


import com.example.agencyService2.model.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
}
