package services;

import exceptions.WrongDateException;
import exceptions.WrongLoginException;
import model.*;
import org.apache.commons.io.FileUtils;

import javax.jws.WebService;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@WebService(endpointInterface = "services.HotelService")
public class HotelServiceImpl implements HotelService {

    private Hotel hotel;
    private Map<Integer, String> nbPersonnesToTypeChambre = new HashMap<>();

    public HotelServiceImpl() {
    }

    public HotelServiceImpl(Hotel hotel) {
        this.hotel = hotel;
        this.nbPersonnesToTypeChambre.put(1, "Single");
        this.nbPersonnesToTypeChambre.put(2, "Double");
        this.nbPersonnesToTypeChambre.put(3, "Triple");
    }

    @Override
    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public List<Offre> getOffres(String idAgence, String mdpAgence, String dateArrivee, String dateDepart, int nbPersonne)
            throws WrongDateException, WrongLoginException, ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date arrivee = formatter.parse(dateArrivee);
        Date depart = formatter.parse(dateDepart);
        Agence agence = hotel.getAgencesPartenaires().stream()
                .filter(a -> a.getId().equals(idAgence) && a.getPassowrd().equals(mdpAgence)).findFirst().orElse(null);
        if (agence == null) {
            throw new WrongLoginException("L'idenfiant ou le mot de passe est erroné.");
        }
        if (depart.before(arrivee)) {
            throw new WrongDateException("La date de départ ne peut être avant celle d'arrivée.");
        }
        List<Offre> offres = new ArrayList<>();
        hotel.getOffresProposees().clear();
        for (Chambre chambre : hotel.getChambres()){
            if (chambre.available(arrivee, depart) && chambre.getNbPersonne()>=nbPersonne){
                String idOffre = UUID.randomUUID().toString();
                String typeChambre = nbPersonnesToTypeChambre.get(chambre.getNbPersonne());
                double price = chambre.getPrice() * agence.getPricePercentage() / 100;
                try {
                    String encodedImage = getEncodedImage(chambre.getRoomImagePath());
                    Offre newOffre = new Offre(idOffre, hotel.getName(), typeChambre, chambre.getNumber(), encodedImage,
                            arrivee, arrivee, depart, price, nbPersonne);
                    offres.add(newOffre);
                    hotel.getOffresProposees().add(newOffre);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return offres;
    }

    private String getEncodedImage(String imageUrl) throws IOException {
        byte[] imageContent;
        imageContent = FileUtils.readFileToByteArray(new File(imageUrl));
        return Base64.getEncoder().encodeToString(imageContent);
    }
}
