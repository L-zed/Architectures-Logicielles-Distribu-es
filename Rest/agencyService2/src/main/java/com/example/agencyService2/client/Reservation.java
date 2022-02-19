package com.example.agencyService2.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reservation {
    private Long id;
    private LocalDate arrival;
    private LocalDate departure;
    private Long idRoom;
    private Long clientId;


    public Reservation(LocalDate arrival, LocalDate departure, Long idRoom, Long clientId) {
        this.arrival = arrival;
        this.departure = departure;
        this.idRoom = idRoom;
        this.clientId = clientId;
    }
}
