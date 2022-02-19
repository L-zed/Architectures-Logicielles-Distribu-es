package com.example.tripadvisor.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer {
    private Long id;
    private String roomType;
    private double price;
    private Long idRoom;
    LocalDate arrival;
    LocalDate departure;
    Hotel hotelDistant;

    public Offer(String roomType, double price, Long idRoom, LocalDate arrival, LocalDate departure, Hotel hotelDistant) {
        this.roomType = roomType;
        this.price = price;
        this.idRoom = idRoom;
        this.arrival = arrival;
        this.departure = departure;
        this.hotelDistant = hotelDistant;
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
