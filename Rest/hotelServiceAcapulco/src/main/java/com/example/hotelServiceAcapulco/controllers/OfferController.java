package com.example.hotelServiceAcapulco.controllers;


import com.example.hotelServiceAcapulco.exceptions.WrongDateException;
import com.example.hotelServiceAcapulco.exceptions.WrongLoginException;
import com.example.hotelServiceAcapulco.model.Hotel;
import com.example.hotelServiceAcapulco.model.Offer;
import com.example.hotelServiceAcapulco.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfferController {
    @Autowired
    private OfferService offerService;
    private static final String hotelName ="acapulco";

    @GetMapping(hotelName)
    public Hotel getHotel(){
        return offerService.getHotel();
    }
    @GetMapping(hotelName+"/offers/{agencyId}/{agencyPassword}/{arrival}/{departure}/{nbPersonne}/{minPrice}/{maxPrice}")
    public List<Offer> getOffers(@PathVariable Long agencyId, @PathVariable String agencyPassword, String arrival, @PathVariable
                                 String departure, @PathVariable int nbPersonne, @PathVariable double minPrice
            , @PathVariable double maxPrice)
            throws WrongDateException, WrongLoginException {
        return offerService.getOffers(agencyId, agencyPassword, arrival, departure, nbPersonne, hotelName, minPrice, maxPrice);
    }

}
