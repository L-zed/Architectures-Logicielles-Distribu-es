package com.example.agencyService2.controller;


import com.example.agencyService2.client.Offer;
import com.example.agencyService2.model.Agency;
import com.example.agencyService2.model.Hotel;
import com.example.agencyService2.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OfferController {
    @Autowired
    private OfferService offerService;
    private static  final String agencyName = "agency2";

    @GetMapping(agencyName)
    public Agency getAgency(){
        return offerService.getAgency();
    }

    @GetMapping(agencyName+"/hotels")
    private List<Hotel> getHotels(){
        return offerService.getHotels();
    }

    @GetMapping(agencyName+"/offers/{agencyId}/{agencyPassword}/{arrival}/{departure}/{nbPersonne}/{hotelName}" +
            "/{minPrice}/{maxPrice}/{city}/{stars}")
    public List<Offer> getOffers(
            @PathVariable Long agencyId,@PathVariable String agencyPassword,@PathVariable String arrival
            , @PathVariable String departure, @PathVariable int nbPersonne, @PathVariable String hotelName
            , @PathVariable double minPrice, @PathVariable double maxPrice, @PathVariable String city
            , @PathVariable int stars){
        return offerService.getOffers(agencyId, agencyPassword,arrival, departure , nbPersonne, hotelName, minPrice
                , maxPrice, city, stars);
    }
}
