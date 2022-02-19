package com.example.hotelServiceAcapulco.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Agency {
    @Id
    private Long id;
    @Column(name = "password")
    private String password;
    @Column(name = "pricePercentage")
    private int pricePercentage;
    /*@ManyToMany(mappedBy = "agencies")
    private List<Hotel> hotels;*/
    @Column(name="hotel")
    private Long idHotel;

    public Agency(Long id,String password, int pricePercentage, Long hotel) {
        this.id = id;
        this.idHotel = hotel;
        this.password = password;
        this.pricePercentage = pricePercentage;
    }
}
