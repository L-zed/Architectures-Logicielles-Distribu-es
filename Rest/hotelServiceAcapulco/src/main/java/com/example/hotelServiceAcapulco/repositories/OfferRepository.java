package com.example.hotelServiceAcapulco.repositories;


import com.example.hotelServiceAcapulco.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
