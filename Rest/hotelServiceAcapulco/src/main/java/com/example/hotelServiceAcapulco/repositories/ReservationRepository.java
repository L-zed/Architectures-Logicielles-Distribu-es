package com.example.hotelServiceAcapulco.repositories;


import com.example.hotelServiceAcapulco.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
