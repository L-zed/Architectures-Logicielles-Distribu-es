package com.example.tripadvisor.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Agency {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "uri")
    private String uri;

    public Agency(Long id, String name, String uri) {
        this.id = id;
        this.name = name;
        this.uri = uri;
    }
}
