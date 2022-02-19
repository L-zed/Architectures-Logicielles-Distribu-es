package model;

import java.util.ArrayList;
import java.util.Date;

public class Chambre {
    //Attribut
    private int number;
    private int nbLit;
    private int nbPersonne;
    private double price;
    private ArrayList<Reservation> reservations = new ArrayList<>() ;
    private String roomImagePath;


    //Constructors
    public Chambre() {
    }

    public Chambre(int number, int nbLit, int nbPersonne, double price, String roomImagePath) {
        this.number = number;
        this.nbLit = nbLit;
        this.nbPersonne = nbPersonne;
        this.price = price;
        this.roomImagePath = roomImagePath;
    }

    //Getters and Setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNbLit() {
        return nbLit;
    }

    public void setNbLit(int nbLit) {
        this.nbLit = nbLit;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public void setNbPersonne(int nbPersonne) {
        this.nbPersonne = nbPersonne;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public String getRoomImagePath() {
        return roomImagePath;
    }

    public void setRoomImagePath(String roomImagePath) {
        this.roomImagePath = roomImagePath;
    }


    //Mthodes

     public boolean available(Date arrival, Date departure){
        for(Reservation reservation : reservations) {
            if(reservation.getDateArrivee().equals(arrival) || reservation.getDateDepart().equals(departure)) {
                return false;
            }
            if((reservation.getDateArrivee().before(arrival) && reservation.getDateDepart().after(arrival)) ||
                    (reservation.getDateArrivee().before(departure) && reservation.getDateDepart().after(departure))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "number=" + number +
                ", nbLit=" + nbLit +
                ", nbPersonne=" + nbPersonne +
                ", price=" + price +
                '}';
    }

}
