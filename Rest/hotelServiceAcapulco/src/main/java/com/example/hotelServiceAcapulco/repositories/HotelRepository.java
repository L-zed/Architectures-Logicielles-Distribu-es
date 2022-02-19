package com.example.hotelServiceAcapulco.repositories;


import com.example.hotelServiceAcapulco.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
    Hotel findByName(String name);
}
