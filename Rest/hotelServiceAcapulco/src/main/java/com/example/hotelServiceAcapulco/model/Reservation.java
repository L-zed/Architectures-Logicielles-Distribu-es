package com.example.hotelServiceAcapulco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "arrival")
    private LocalDate arrival;
    @Column(name = "departure")
    private LocalDate departure;
    @Column(name="room")
    private Long idRoom;
    @Column(name="client")
    private Long clientId;


    public Reservation(LocalDate arrival, LocalDate departure, Long idRoom, Long clientId) {
        this.arrival = arrival;
        this.departure = departure;
        this.idRoom = idRoom;
        this.clientId = clientId;
    }
}
