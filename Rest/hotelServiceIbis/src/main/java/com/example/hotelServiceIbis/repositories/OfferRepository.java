package com.example.hotelServiceIbis.repositories;


import com.example.hotelServiceIbis.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
