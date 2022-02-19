package com.example.hotelServiceIbis.controllers;



import com.example.hotelServiceIbis.exceptions.WrongDateException;
import com.example.hotelServiceIbis.exceptions.WrongLoginException;
import com.example.hotelServiceIbis.model.Hotel;
import com.example.hotelServiceIbis.model.Offer;
import com.example.hotelServiceIbis.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfferController {
    @Autowired
    private OfferService offerService;
    private static final String hotelName ="ibis";

/*
    @GetMapping(hotelName +"/offers/{id}")
    public Offer getOfferFromId(@PathVariable Long id) {
        return offerRepository.findById(id).get();
    }*/

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
