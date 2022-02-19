package CLI_Main;
import org.apache.commons.io.FileUtils;
import wsdl_agence.*;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.List;

public class AgenceServiceClientCLI extends AbstractMain{
    public static IntegerInputProcessor inputProcessor;
    public static String imagesDirectory = "./src/main/java/images/";

    public static void main(String[] args) {
        AgenceServiceClientCLI m = new AgenceServiceClientCLI();
        OffresAggregeesService proxy = null;
        BufferedReader inputReader;
        String userInput = "";

        try {
            inputReader = new BufferedReader(
                    new InputStreamReader(System.in));
            m.setTestServiceWSDLUrl(inputReader);
            proxy = getProxy();

            do {
                m.menu();
                userInput = inputReader.readLine();
                m.processUserInput(inputReader, userInput, proxy);
                Thread.sleep(3000);

            } while (!userInput.equals(QUIT));
        } catch (MalformedURLException e) {
            System.err.println(SERVICE_WSDL_URL + " isn't a valid WSDL URL");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected boolean validServiceWSDLUrl() {
        return SERVICE_WSDL_URL.equals(
                "http://localhost:3000/offreservice?wsdl");
    }

    private static OffresAggregeesService getProxy() throws MalformedURLException{
        return new OffresAggregeesServiceImplService(new URL(SERVICE_WSDL_URL)).getOffresAggregeesServiceImplPort();
    }

    @Override
    protected void menu() {
        StringBuilder builder = new StringBuilder();
        builder.append(QUIT+". Quit.");
        builder.append("\n1. Get Hotels and their offres.");
        System.out.println(builder);

    }

    @Override
    protected void processUserInput(BufferedReader inputReader, String userInput, OffresAggregeesService proxy) {
        try {
            switch(userInput) {
                case "1":
                    java.util.Scanner entree = new java.util.Scanner(System.in);
                    System.out.println("Please enter a city");
                    String ville= entree.nextLine();

                    System.out.println("Please enter the number of stars");
                    IntegerInputProcessor inputProcessor = new IntegerInputProcessor(inputReader);
                    int nbStars = (int) inputProcessor.process();

                    java.util.Scanner entree1 =   new java.util.Scanner(System.in);
                    System.out.println("Please enter arrival date");
                    String dateA = entree1.nextLine();

                    System.out.println("Please enter daparture date");
                    java.util.Scanner entree2 =   new java.util.Scanner(System.in);
                    String dated = entree2.nextLine();

                    System.out.println("Please enter  min price");
                    java.util.Scanner entree11 =   new java.util.Scanner(System.in);
                    Double minPrice = entree11.nextDouble();

                    System.out.println("Please enter  max price");
                    java.util.Scanner entree12 =   new java.util.Scanner(System.in);
                    Double maxPrice = entree12.nextDouble();

                    System.out.println("Please enter nb person");
                    inputProcessor = new IntegerInputProcessor(inputReader);
                    int nbPerson = (int) inputProcessor.process();


                    List<Hotel> hotels = proxy.getHotels(ville,nbPerson);
                    for (Hotel h : hotels){
                        System.out.println("Nom hotel : "+ h.getName());
                        List<Offre> offres = proxy.getOffres(h,dateA,dated,nbPerson);
                        for (Offre o : offres){
                            String image = decodeImage(o.getRoomImage(), o.getIdOffre());
                            System.out.println("Id offre : "+o.getIdOffre() +"\n" +
                            "Type de chambre : "+ o.getTypeChambre() + "\n" +
                             "Prix : " +o.getPrix() + "\n"+
                               "Lien vers l'image de la chambre : " + image);
                        }
                    }

                    System.out.println();
                    System.out.println("------------------------You can make a reservation------------------------");
                    System.out.println("Please enter the name of the hotel");
                    java.util.Scanner entree3 = new java.util.Scanner(System.in);
                    String nomHotel= entree3.nextLine();

                    System.out.println("Please enter the Id of the offre");
                    java.util.Scanner entree4 = new java.util.Scanner(System.in);
                    String idOffre= entree4.nextLine();

                    System.out.println("Please enter your first name");
                    java.util.Scanner entree5 = new java.util.Scanner(System.in);
                    String nameClient= entree5.nextLine();

                    System.out.println("Please enter your last name");
                    java.util.Scanner entree6 = new java.util.Scanner(System.in);
                    String firstNameClient= entree6.nextLine();
                    URL urlReservation = new URL("http://localhost:3000/reservationservice?wsdl");
                    ReservationServiceImplService reservationImp = new ReservationServiceImplService(urlReservation);
                    ReservationService proxyReservation = reservationImp.getReservationServiceImplPort();
                    String reservationCreat =
                            proxyReservation.createReservation(nomHotel,idOffre,nameClient,firstNameClient);

                    System.out.println("Reservation confirmée, voici votre numéro de résérvation : "
                            +reservationCreat);
                    break;

                default:
                    System.err.println("Sorry, wrong input. Please try again.");
                    return;
            }

            } catch (IOException | MalformedURLException_Exception | ParseExceptionException | WrongDateExceptionException | WrongLoginExceptionException e) {
                e.printStackTrace();
            }
    }

    private String decodeImage(String encodedImage, String offreId) {
        String imageName = offreId+".jpeg";
        String imagePath = imagesDirectory + imageName;
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(encodedImage);
            FileUtils.writeByteArrayToFile(new File(imagePath), decodedBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Paths.get("../images/"+imageName).toAbsolutePath().normalize().toString();
    }
}
