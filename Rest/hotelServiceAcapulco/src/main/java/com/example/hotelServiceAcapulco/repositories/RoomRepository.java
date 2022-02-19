package com.example.hotelServiceAcapulco.repositories;


import com.example.hotelServiceAcapulco.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
