package com.example.hotelServiceIbis.repositories;


import com.example.hotelServiceIbis.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
