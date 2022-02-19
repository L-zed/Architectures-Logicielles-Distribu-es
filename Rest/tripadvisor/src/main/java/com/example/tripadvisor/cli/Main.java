package com.example.tripadvisor.cli;

import com.example.tripadvisor.client.Hotel;
import com.example.tripadvisor.client.Offer;
import com.example.tripadvisor.model.Agency;
import com.example.tripadvisor.repositories.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Main {
    @Autowired
    AgencyRepository agencyRepository;
    @Autowired
    RestTemplate proxy;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        runCLI() ;
    }

    void runCLI(){
        java.util.Scanner entree = new java.util.Scanner(System.in);
        System.out.println("Please enter a city");
        String ville= entree.nextLine();

        System.out.println("Please enter the number of stars");
        int nbStars = entree.nextInt();

        java.util.Scanner entree1 =   new java.util.Scanner(System.in);
        System.out.println("Please enter arrival date");
        String dateA = entree1.nextLine();

        System.out.println("Please enter departure date");
        java.util.Scanner entree2 =   new java.util.Scanner(System.in);
        String dated = entree2.nextLine();
        LocalDate departure = LocalDate.parse(dated);
        System.out.println(departure);

        System.out.println("Please enter  min price");
        java.util.Scanner entree11 =   new java.util.Scanner(System.in);
        Double minPrice = entree11.nextDouble();

        System.out.println("Please enter  max price");
        java.util.Scanner entree12 =   new java.util.Scanner(System.in);
        Double maxPrice = entree12.nextDouble();

        System.out.println("Please enter nb person");
        int nbPerson = entree12.nextInt();

        List<Agency> agencies = agencyRepository.findAll();
        int nbOffres = 0;
        for (Agency a : agencies){
            System.out.println("----------Offers of " + a.getName()+"----------");
            System.out.println("Agency ID " + a.getId());

            String uriAgency = a.getUri();
            Hotel[] hotelsProxy = proxy.getForObject(uriAgency+"/hotels", Hotel[].class);
            List<Hotel> hotels = new ArrayList<>();
            hotels.addAll(Arrays.asList(hotelsProxy));
            for (Hotel h : hotels){
                List<Offer> offerList = new ArrayList<>();
                String agencyPassword = h.getAgencyPassword();
                String uriOffer = uriAgency+"/offers/"+a.getId()+"/"+agencyPassword+"/"+dateA+"/"+
                        dated+"/"+nbPerson+"/"+h.getName()+"/"+minPrice+"/"+maxPrice+"/"+ville+"/"+nbStars;
                Offer[] offers = proxy.getForObject(uriOffer, Offer[].class);
                offerList.addAll(Arrays.asList(offers));
                if(!(offerList.size() == 0)){
                    nbOffres++;
                    System.out.println("Hotel{" +
                            "id=" + h.getId() +
                            ", name='" + h.getName() + '\'' +
                            ", stars=" + h.getStars() +
                            ", address='" + h.getAddress() + '\'' +
                            '}');
                    System.out.println("The offers of this hotel proposed by the agency " + a.getName() + " : ");
                    for (Offer o : offerList) {
                        System.out.println("Offer{" +
                                "id=" + o.getId() +
                                ", roomType='" + o.getRoomType() + '\'' +
                                ", price=" + o.getPrice() +
                                ", idRoom=" + o.getIdRoom() +
                                ", arrival=" + o.getArrival() +
                                ", departure=" + o.getDeparture());
                    }
                }
            }
        }
        if (nbOffres == 0) {
            System.out.println("We are sorry their is no offer compatible with your criteria");
        }

        if (nbOffres > 0) {
            System.out.println("------------------------You can make a reservation------------------------");
            System.out.println("Please enter the id of the agency");
            java.util.Scanner entree15 = new java.util.Scanner(System.in);
            Long agency_id = entree15.nextLong();

            Agency a = agencyRepository.findById(agency_id).get();

            System.out.println("Please enter the id of the hotel");
            java.util.Scanner entree3 = new java.util.Scanner(System.in);
            int hotelId = entree3.nextInt();

            System.out.println("Please enter the Id of the offer");
            java.util.Scanner entree4 = new java.util.Scanner(System.in);
            String idOffer = entree4.nextLine();

            System.out.println("Please enter your first name");
            java.util.Scanner entree5 = new java.util.Scanner(System.in);
            String firstNameClient = entree5.nextLine();

            System.out.println("Please enter your last name");
            java.util.Scanner entree6 = new java.util.Scanner(System.in);
            String lastNameClient = entree6.nextLine();


            String uriReservation = a.getUri()+"/reservation/" + hotelId + "/" + idOffer + "/" + firstNameClient
                    + "/" + lastNameClient;


            Long reservation = proxy.getForObject(uriReservation, Long.class);
            if (reservation != null) {
                System.out.println("Reservation confirmed, this the id of your reservation : " + reservation);
            } else {
                System.out.println("We are sorry we had a problem with your reservation please try again");
            }
        }
    }
}
