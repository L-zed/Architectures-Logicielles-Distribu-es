package com.example.hotelServiceIbis.repositories;


import com.example.hotelServiceIbis.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
