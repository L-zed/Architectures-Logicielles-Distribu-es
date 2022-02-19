package com.example.hotelServiceIbis.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "number")
    private int number;
    @Column(name = "beds")
    private int beds;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "price")
    private float price;
    @Column(name="hotel")
    private Long idHotel;
    @Column(name="image")
    private String roomImage;

    public Room(int number, int beds, int capacity, float price, Long hotel, String roomImage) {
        this.number = number;
        this.beds = beds;
        this.capacity = capacity;
        this.price = price;
        this.idHotel = hotel;
        this.roomImage = roomImage;
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
