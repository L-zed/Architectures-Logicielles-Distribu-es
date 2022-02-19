package server;

import model.Agence;
import services.OffresAggregeesServiceImpl;
import services.ReservationServiceImpl;

import javax.xml.ws.Endpoint;
import java.util.HashMap;

public class ServerAgence {
    public static void main(String[] args) {
        Agence agence = new Agence("agence1", "mdp1");
        HashMap<String, String> hotelNamesAndPorts = new HashMap<>();
        hotelNamesAndPorts.put("acapulco", "8080");
        hotelNamesAndPorts.put("ibis", "9090");

        Endpoint.publish("http://localhost:3000/offreservice",
                new OffresAggregeesServiceImpl(agence, hotelNamesAndPorts));
        
        Endpoint.publish("http://localhost:3000/reservationservice",
                new ReservationServiceImpl(agence,hotelNamesAndPorts));

        System.out.println("Agency server is ready");

    }
}
