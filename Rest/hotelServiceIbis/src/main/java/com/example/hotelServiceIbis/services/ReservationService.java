package com.example.hotelServiceIbis.services;


import com.example.hotelServiceIbis.exceptions.WrongIdException;
import com.example.hotelServiceIbis.exceptions.WrongLoginException;
import com.example.hotelServiceIbis.model.*;
import com.example.hotelServiceIbis.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationService {
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

    public Long creatReservation(Long agencyId, String agencyPassword, Long offerId, String firstName
            , String lastName, String hotelName) throws WrongLoginException, WrongIdException {
        Hotel hotel = hotelRepository.findByName(hotelName);
        Optional<Agency> agency = agencyRepository.findById(agencyId);
        if (agency.isEmpty() | !agency.get().getPassword().equals(agencyPassword)) {
            throw new WrongLoginException("The id or the password is wrong.");
        }
        Optional<Offer> offer = offerRepository.findById(offerId);
        if (offer.isEmpty()) {
            throw new WrongIdException("The id of the offer is incorrect.");
        }
        Client client = new Client(firstName,lastName);
        clientRepository.save(client);
        Reservation newReservation = new Reservation(offer.get().getArrival(), offer.get().getDeparture(),
                offer.get().getIdRoom(), client.getId());
        reservationRepository.save(newReservation);
        return newReservation.getId();
    }
}
