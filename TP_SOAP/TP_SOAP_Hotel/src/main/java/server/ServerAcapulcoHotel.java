package server;

import model.Adresse;
import model.Agence;
import model.Chambre;
import model.Hotel;
import services.HotelServiceImpl;
import services.ReservationServiceImpl;

import javax.xml.ws.Endpoint;
import java.util.*;

public class ServerAcapulcoHotel {
    public static void main(String[] args) {
        // Hotel Acapulco
        String roomImagePath = "./src/main/java/images/chambre.jpeg";
        List<Chambre> chambresAcapulco = new ArrayList<>(Arrays.asList(
                new Chambre(4, 2, 2, 30.0, roomImagePath),
                new Chambre(3, 3, 3, 35, roomImagePath),
                new Chambre(2, 1, 2, 25, roomImagePath),
                new Chambre(1, 1, 2, 30, roomImagePath)
        ));
        List<Agence> agencesPartenaires = new ArrayList<>(Arrays.asList(
                new Agence("agence1", "mdp1", 90d),
                new Agence("agence2", "mdp2", 80d)
        ));
        Adresse adresseAcapulco = new Adresse(445,"Auguste brousonnet",34090,"Montpellier","France","");
        Hotel acapulco = new Hotel("acapulco",adresseAcapulco,2,chambresAcapulco, agencesPartenaires);

        Endpoint.publish("http://localhost:8080/hotelserviceacapulco", new HotelServiceImpl(acapulco));
        Endpoint.publish("http://localhost:8080/reservationserviceacapulco",
                new ReservationServiceImpl(acapulco));
        System.err.println("Server Ready !");
    }
}
