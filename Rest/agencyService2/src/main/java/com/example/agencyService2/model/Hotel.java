package com.example.agencyService2.model;

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
    @Column(name = "uri")
    private String uri;
    @Column(name = "agencyPassword")
    private String agencyPassword;
    @Column(name = "agency")
    private Long agencyId;


    public Hotel(Long id, String name, int stars, String address, String uri, String agencyPassword, Long agencyId) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.address = address;
        this.uri = uri;
        this.agencyPassword = agencyPassword;
        this.agencyId = agencyId;
    }
}
