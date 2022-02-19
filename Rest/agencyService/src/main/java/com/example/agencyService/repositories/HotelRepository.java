package com.example.agencyService.repositories;

import com.example.agencyService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
    Hotel findByName(String name);
}
