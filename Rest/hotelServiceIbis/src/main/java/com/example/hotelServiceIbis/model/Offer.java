package com.example.hotelServiceIbis.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Data
@Entity
public class Offer {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "roomType")
    private String roomType;
    @Column(name = "price")
    private double price;
    @Column(name="room")
    private Long idRoom;
    @Column(name="arrival")
    private LocalDate arrival;
    @Column(name="departure")
    private LocalDate departure;
    @Column( name = "agency")
    private Long agencyId;
    @Transient
    private String encodedRoomImage;

    public Offer(String roomType, double price, Long idRoom, LocalDate arrival, LocalDate departure, Long agencyId) {
        this.roomType = roomType;
        this.price = price;
        this.idRoom = idRoom;
        this.arrival = arrival;
        this.departure = departure;
        this.agencyId = agencyId;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", idRoom=" + idRoom +
                ", arrival=" + arrival +
                ", departure=" + departure +
                '}';
    }
}
