package com.example.hotelServiceAcapulco.repositories;

import com.example.hotelServiceAcapulco.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
