package com.example.agencyService.services;

import com.example.agencyService.client.HotelDistant;
import com.example.agencyService.client.Offer;
import com.example.agencyService.model.Agency;
import com.example.agencyService.model.Hotel;
import com.example.agencyService.repositories.AgencyRepository;
import com.example.agencyService.repositories.HotelRepository;
import com.sun.xml.bind.v2.TODO;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Service
public class OfferService {
    @Autowired
    private AgencyRepository agencyRepository;
    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    RestTemplate proxy;


    public Agency getAgency(){
        return agencyRepository.findAll().get(0);
    }
    public List<Hotel> getHotels(){
        return hotelRepository.findAll();
    }

    public List<Offer> getOffers(Long agencyId, String agencyPassword, String arrival, String departure, int nbPersonne,
                                  String hotelName, double minPrice, double maxPrice, String city, int stars){
        List<Offer> offers = new ArrayList<>();
        List<Hotel> hotels = getHotels();
        for (Hotel h : hotels){
            HotelDistant hotelDistant = proxy.getForObject(h.getUri(),HotelDistant.class);
            if (hotelDistant.getAddress().equals(city) && hotelDistant.getStars() == stars && h.getName().equals(hotelName)){
                String uriOffer = h.getUri()+"/offers/"+agencyId+"/"+agencyPassword+"/"+arrival+"/"+
                        departure+"/"+nbPersonne+"/"+minPrice+"/"+maxPrice;
                Offer[] newOffers = proxy.getForObject(uriOffer, Offer[].class);
                for (Offer offer: newOffers) {
                    String image = decodeImage(offer.getEncodedRoomImage(), offer.getId());
                    offer.setEncodedRoomImage(image);
                }
                offers.addAll(Arrays.asList(newOffers));
            }
        }
        return offers;
    }

    private String decodeImage(String encodedImage, Long offreId) {
        String imageName = offreId+".jpeg";
        String imagePath = "images/" + imageName;
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(encodedImage);
            FileUtils.writeByteArrayToFile(new File(imagePath), decodedBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Paths.get(imagePath).toAbsolutePath().normalize().toString();
    }
}
