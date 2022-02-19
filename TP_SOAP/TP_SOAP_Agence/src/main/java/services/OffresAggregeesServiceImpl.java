package services;
import wsdl_hotel.*;
import model.Agence;

import javax.jws.WebService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "services.OffresAggregeesService")
public class OffresAggregeesServiceImpl implements OffresAggregeesService {

    private Agence agence;
    private Map<String, String> hotelNamesAndPorts;

    public OffresAggregeesServiceImpl() {
    }

    public OffresAggregeesServiceImpl(Agence agence, Map<String, String> hotelNamesAndPorts) {
        this.agence = agence;
        this.hotelNamesAndPorts = hotelNamesAndPorts;
    }


    @Override
    public List<Hotel> getHotels(String city, int nbStars) throws MalformedURLException {
        List<Hotel> hotels = new ArrayList<>();
        for (Map.Entry<String,String> entry : hotelNamesAndPorts.entrySet()){
            URL url = new URL("http://localhost:" + entry.getValue() + "/hotelservice" +
                    entry.getKey() + "?wsdl");
            HotelServiceImplService OffreServiceImpl = new HotelServiceImplService(url);
            HotelService hotelProxy = OffreServiceImpl.getHotelServiceImplPort();
            Hotel hotel = hotelProxy.getHotel();
            if (hotel.getAdresse().getVille().equals(city) && nbStars == hotel.getNbEtoile()){
                hotels.add(hotel);
            }
        }
        return hotels ;
    }

    @Override
    public List<Offre> getOffres(Hotel hotel, String ArrivalDate, String departureDate, int nbPersonnes) throws
            MalformedURLException, WrongDateException_Exception, ParseException_Exception, WrongLoginException_Exception {
        URL url = new URL("http://localhost:" + hotelNamesAndPorts.get(hotel.getName()) + "/hotelservice" +
                hotel.getName() + "?wsdl");
        HotelServiceImplService OffreServiceImpl = new HotelServiceImplService(url);
        HotelService offreProxy = OffreServiceImpl.getHotelServiceImplPort();
        //Hotel hotel = offreProxy.getHotel();
        List<Offre> offres = offreProxy.getOffres(agence.getId(), agence.getPassowrd(), ArrivalDate, departureDate,
                nbPersonnes);
        return offres;
    }



    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

}
