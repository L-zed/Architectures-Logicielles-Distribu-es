package services;

import exceptions.WrongIdException;
import exceptions.WrongLoginException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ReservationService {
    @WebMethod
    String createReservation(String idAgence, String mdpAgence, String idOffre, String nom, String prenom)
            throws WrongLoginException, WrongIdException;
}
