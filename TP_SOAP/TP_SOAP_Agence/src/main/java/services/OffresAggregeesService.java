package services;

import wsdl_hotel.*;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

@WebService
public interface OffresAggregeesService {
    @WebMethod
    List<Hotel> getHotels(String city, int nbStars) throws MalformedURLException;
    @WebMethod
    List<Offre> getOffres(Hotel hotel, String arrivalDate, String departureDate, int nbPersons)
            throws MalformedURLException, WrongDateException_Exception, ParseException_Exception, WrongLoginException_Exception;
}
