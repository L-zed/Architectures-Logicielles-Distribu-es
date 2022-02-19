package com.example.hotelServiceIbis.services;


import com.example.hotelServiceIbis.exceptions.WrongDateException;
import com.example.hotelServiceIbis.exceptions.WrongLoginException;
import com.example.hotelServiceIbis.model.*;
import com.example.hotelServiceIbis.repositories.*;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class OfferService {
    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OfferRepository offerRepository;
    @Autowired
    private AgencyRepository agencyRepository;


    public Hotel getHotel(){
        return hotelRepository.findAll().get(0);
    }

    public List<Offer> getOffers(Long agencyId, String agencyPassword, String arrival
            , String departure, int nbPersonne, String hotelName, double minPrice , double maxPrice)
            throws WrongDateException, WrongLoginException {
        LocalDate arrivee = LocalDate.parse(departure);
        LocalDate depart = LocalDate.parse(departure);
        Hotel hotel = hotelRepository.findByName(hotelName);
        Optional<Agency> agency = agencyRepository.findById(agencyId);
        if (agency.isEmpty() | !agency.get().getPassword().equals(agencyPassword)) {
            throw new WrongLoginException("The id or the password is wrong.");
        }
        if (depart.isBefore(arrivee)) {
            throw new WrongDateException("The departure date cant be before the arrival date.");
        }
        List<Offer> offers1 = offerRepository.findAll();
        for (Offer o : offers1){
            if(o.getAgencyId() == agencyId){
                Offer offer = offerRepository.findById(o.getId()).get();
                offerRepository.delete(offer);
            }
        }
        List<Offer> offers = new ArrayList<>();
        List<Room> rooms = roomRepository.findAll();
        for (Room room : rooms){
            boolean available = true;
            for (Reservation reservation : reservationRepository.findAll()) {
                if (reservation.getIdRoom() == room.getId()) {
                    if (reservation.getArrival().equals(arrivee) || reservation.getDeparture().equals(depart)) {
                        available = false;
                    }
                    if ((reservation.getArrival().isBefore(arrivee) && reservation.getDeparture().isAfter(arrivee)) ||
                            (reservation.getArrival().isBefore(depart) && reservation.getDeparture().isAfter(depart))) {
                        available = false;
                    }
                }
            }
                if (available && room.getCapacity()>=nbPersonne){
                    String roomType = room.getRoomType();
                    double price = room.getPrice() - (room.getPrice() * agency.get().getPricePercentage() / 100);
                    if (price <= maxPrice && price>=minPrice ) {
                        Offer newOffer = new Offer(roomType, price, room.getId(), arrivee, depart, agencyId);
                        newOffer.setEncodedRoomImage(getEncodedImage(room.getRoomImage()));
                        offerRepository.save(newOffer);
                        offers.add(newOffer);
                    }
                }

        }
        return offers;
    }

    private String getEncodedImage(String image) {
        String encodedImage = "";
        try {
            byte[] imageContent;
            Resource resource = new ClassPathResource("images/"+image);
            imageContent = FileUtils.readFileToByteArray(resource.getFile());
            encodedImage = Base64.getEncoder().encodeToString(imageContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return encodedImage;
    }
}
