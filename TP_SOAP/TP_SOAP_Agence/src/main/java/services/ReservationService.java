package services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ReservationService {
    @WebMethod
    String createReservation(String hotel, String idOffre, String nom, String prenom);
}
