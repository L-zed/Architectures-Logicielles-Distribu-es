package com.example.hotelServiceIbis.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Hotel {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "stars")
    private int stars;
    @Column(name = "address")
    private String address;
    /*@ManyToMany
    @JoinTable(
            name = "hotels_agencies",
            joinColumns = @JoinColumn(name = "hotel_id"),
            inverseJoinColumns = @JoinColumn(name = "agency_id"))*/

    public Hotel(Long id,String name, int stars, String address) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stars='" + stars + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
