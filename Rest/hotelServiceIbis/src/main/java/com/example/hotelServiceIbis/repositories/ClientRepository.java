package com.example.hotelServiceIbis.repositories;

import com.example.hotelServiceIbis.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
