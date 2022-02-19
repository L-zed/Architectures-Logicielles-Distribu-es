package com.example.agencyService2.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelDistant {
    private Long id;
    private String name;
    private int stars;
    private String address;

    public HotelDistant(Long id, String name, int stars, String address) {
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
