package com.example.hotelServiceIbis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {
		"com.example.hotelServiceIbis.model"
})
@EnableJpaRepositories(basePackages = {
		"com.example.hotelServiceIbis.repositories"
})
@SpringBootApplication(scanBasePackages = {
		"com.example.hotelServiceIbis.controllers",
		"com.example.hotelServiceIbis.dataAcapulco",
		"com.example.hotelServiceIbis.services"
})
public class HotelServiceIbisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceIbisApplication.class, args);
	}

}
