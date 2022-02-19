package com.example.tripadvisor.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {
    private Long id;
    private int number;
    private int beds;
    private int capacity;
    private float price;
    private Long idHotel;

    public Room(int number, int beds, int capacity, float price, Long hotel) {
        this.number = number;
        this.beds = beds;
        this.capacity = capacity;
        this.price = price;
        this.idHotel = hotel;
    }

    public String getRoomType(){
        String type;
        if (capacity == 1) {
            type = "Single";
        }
        else {
            if (capacity == 2){
                type = "Double";
            }
            else {
                type = "Triple";
            }
        }
        return type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
