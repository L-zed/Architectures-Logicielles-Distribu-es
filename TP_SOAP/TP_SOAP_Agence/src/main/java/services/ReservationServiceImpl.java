package services;

import model.Agence;
import wsdl_hotel.ReservationServiceImplService;
import wsdl_hotel.WrongLoginException_Exception;

import javax.jws.WebService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

@WebService(endpointInterface = "services.ReservationService")
public class ReservationServiceImpl implements ReservationService {

    private Agence agence;
    private Map<String, String> hotelNamesAndPorts;

    public ReservationServiceImpl() {
    }

    public ReservationServiceImpl(Agence agence, Map<String, String> hotelNamesAndPorts) {
        this.agence = agence;
        this.hotelNamesAndPorts = hotelNamesAndPorts;
    }

    @Override
    public String createReservation(String hotel, String idOffre, String nom, String prenom) {
        String idResa = null;
        try {
            URL url = new URL("http://localhost:"+ hotelNamesAndPorts.get(hotel) +"/reservationservice"+ hotel +"?wsdl");
            ReservationServiceImplService ReservationServiceImpl = new ReservationServiceImplService(url);
            wsdl_hotel.ReservationService reservationProxy = ReservationServiceImpl.getReservationServiceImplPort();
            idResa = reservationProxy.createReservation(agence.getId(), agence.getPassowrd(), idOffre, nom, prenom);
        } catch (MalformedURLException | WrongLoginException_Exception e) {
            e.printStackTrace();
        }
        return idResa;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Map<String, String> getHotelNamesAndPorts() {
        return hotelNamesAndPorts;
    }

    public void setHotelNamesAndPorts(Map<String, String> hotelNamesAndPorts) {
        this.hotelNamesAndPorts = hotelNamesAndPorts;
    }
}
