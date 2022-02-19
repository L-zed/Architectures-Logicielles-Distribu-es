package com.example.hotelServiceIbis.repositories;



import com.example.hotelServiceIbis.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
    Hotel findByName(String name);
}
