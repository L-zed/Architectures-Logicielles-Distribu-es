package com.example.agencyService2.model;

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
    @Column(name = "name")
    private String name;

    public Agency(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
