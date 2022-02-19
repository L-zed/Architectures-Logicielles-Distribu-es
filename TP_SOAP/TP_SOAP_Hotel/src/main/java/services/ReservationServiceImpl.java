package services;

import exceptions.WrongIdException;
import exceptions.WrongLoginException;
import model.*;

import javax.jws.WebService;
import java.util.UUID;

@WebService(endpointInterface = "services.ReservationService")
public class ReservationServiceImpl implements ReservationService {

    private Hotel hotel;

    public ReservationServiceImpl() {
    }

    public ReservationServiceImpl(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String createReservation(String idAgence, String mdpAgence, String idOffre, String nom, String prenom)
            throws WrongLoginException, WrongIdException {
        Agence agence = hotel.getAgencesPartenaires().stream()
                .filter(a -> a.getId().equals(idAgence) && a.getPassowrd().equals(mdpAgence)).findFirst().orElse(null);
        if (agence == null) {
            throw new WrongLoginException("L'idenfiant ou le mot de passe est erroné.");
        }
        Offre offre = hotel.getOffresProposees().stream()
                .filter(o -> o.getIdOffre().equals(idOffre)).findFirst().orElse(null);
        if (offre == null) {
            throw new WrongIdException("L'idenfiant de l'offre est incorrect.");
        }
        String idResa = UUID.randomUUID().toString();
        Client client = new Client(nom, prenom);
        Reservation resa = new Reservation(idResa, offre.getArrivee(), offre.getDepart(), offre.getNbPersonnes(),
                client);
        Chambre chambre = hotel.getChambres().stream()
                .filter(c -> c.getNumber() == offre.getNumeroChambre()).findFirst().get();
        chambre.getReservations().add(resa);
        return idResa;
    }

}
