package com.example.tripadvisor.client;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class AgencyDistant {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;

    public AgencyDistant(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
