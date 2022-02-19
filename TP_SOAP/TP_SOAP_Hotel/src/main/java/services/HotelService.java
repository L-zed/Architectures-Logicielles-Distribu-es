package services;

import exceptions.WrongDateException;
import exceptions.WrongLoginException;
import model.Adresse;
import model.Chambre;
import model.Hotel;
import model.Offre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.ParseException;
import java.util.List;

@WebService
public interface HotelService {
    @WebMethod
    Hotel getHotel();

    @WebMethod
    List<Offre> getOffres(String idAgence, String mdpAgence, String dateArrivee, String dateDepart, int nbPersonne)
            throws WrongDateException, WrongLoginException, ParseException;
}
