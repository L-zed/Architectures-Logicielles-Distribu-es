package com.example.agencyService2.repositories;

import com.example.agencyService2.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
    Hotel findByName(String name);
}
