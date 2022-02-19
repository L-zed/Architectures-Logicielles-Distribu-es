package com.example.hotelServiceAcapulco.controllers;


import com.example.hotelServiceAcapulco.exceptions.WrongIdException;
import com.example.hotelServiceAcapulco.exceptions.WrongLoginException;
import com.example.hotelServiceAcapulco.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    private static final String hotelName ="acapulco";
    @GetMapping(hotelName+"/reservation/{agencyId}/{agencyPassword}/{offerId}/{firstName}/{lastName}")
    public Long creatReservation(@PathVariable Long agencyId, @PathVariable String agencyPassword,
                                 @PathVariable Long offerId, @PathVariable String firstName, @PathVariable String lastName)
            throws WrongLoginException, WrongIdException {
        return reservationService.creatReservation(agencyId, agencyPassword, offerId, firstName, lastName, hotelName);
    }
}
