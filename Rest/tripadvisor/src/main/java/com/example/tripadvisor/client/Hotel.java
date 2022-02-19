package com.example.tripadvisor.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {
    private Long id;
    private String name;
    private int stars;
    private String address;
    private String agencyPassword;
    private Long agencyId;


    public Hotel(Long id, String name, int stars, String address, String agencyPassword, Long agencyId) {
        this.id = id;
        this.name = name;
        this.stars = stars;
        this.address = address;
        this.agencyPassword = agencyPassword;
        this.agencyId = agencyId;
    }


}
