package com.example.hotelServiceAcapulco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {
		"com.example.hotelServiceAcapulco.model"
})
@EnableJpaRepositories(basePackages = {
		"com.example.hotelServiceAcapulco.repositories"
})
@SpringBootApplication(scanBasePackages = {
		"com.example.hotelServiceAcapulco.controllers",
		"com.example.hotelServiceAcapulco.dataAcapulco",
		"com.example.hotelServiceAcapulco.services"
})
public class HotelServiceAcapulcoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceAcapulcoApplication.class, args);
	}

}
