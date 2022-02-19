package com.example.agencyService.services;

import com.example.agencyService.model.Agency;
import com.example.agencyService.repositories.AgencyRepository;
import com.example.agencyService.repositories.HotelRepository;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class ReservationService {
    @Autowired
    private AgencyRepository agencyRepository;
    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    RestTemplate proxy;

    public Long creatReservation(Long hotelId, Long offerId, String firstName, String lastName){
        Agency agency = agencyRepository.findAll().get(0); // j'ai qu'une seule agence
        Long agencyId = agency.getId();
        String agencyPassword = hotelRepository.findById(hotelId).get().getAgencyPassword();
        String hotelName = hotelRepository.findById(hotelId).get().getName();
        String uriHotel = hotelRepository.findById(hotelId).get().getUri();
        // (hotelName+"/reservations/{agencyId}/{agencyPassword}/{offerId}/{firstName}/{lastName}")
        String uriReservation = uriHotel+"/reservation"+"/"+agencyId+"/"+agencyPassword+"/"+offerId+"/"+firstName+"/"+lastName;
        Long reservation = proxy.getForObject(uriReservation, Long.class);
        return reservation;
    }
}
