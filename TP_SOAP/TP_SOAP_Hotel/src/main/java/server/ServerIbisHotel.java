package server;

import model.Adresse;
import model.Agence;
import model.Chambre;
import model.Hotel;
import services.HotelServiceImpl;
import services.ReservationServiceImpl;

import javax.xml.ws.Endpoint;
import java.util.*;

public class ServerIbisHotel {
    public static void main(String[] args) {
        // Hotel Ibis
        String roomImagePath = "./src/main/java/images/chambre.jpeg";
        ArrayList<Chambre> chambresIbis = new ArrayList<>(Arrays.asList(
                new Chambre(4, 2, 2, 55, roomImagePath),
                new Chambre(3, 3, 3, 60, roomImagePath),
                new Chambre(2, 1, 2, 50, roomImagePath),
                new Chambre(1, 1, 2, 55, roomImagePath)
        ));
        List<Agence> agencesPartenaires = new ArrayList<>(Arrays.asList(
                new Agence("agence1", "mdp1", 80d),
                new Agence("agence2", "mdp2", 85d)
        ));
        Adresse adresseIbis = new Adresse(31, "rue du Faubourg", 34000, "Montpellier", "France", "");
        Hotel ibis = new Hotel("ibis", adresseIbis, 3, chambresIbis, agencesPartenaires);

        Endpoint.publish("http://localhost:9090/hotelserviceibis", new HotelServiceImpl(ibis));
        Endpoint.publish("http://localhost:9090/reservationserviceibis", new ReservationServiceImpl(ibis));

        System.err.println("Server Ready !");
    }
}
