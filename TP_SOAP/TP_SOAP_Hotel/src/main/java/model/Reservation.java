package model;

import java.util.Date;

public class Reservation {

    private String idReservation;
    private Date dateArrivee;
    private Date dateDepart;
    private int nbPersonne;
    private Client client;

    public Reservation(String idReservation, Date dateArrivee, Date dateDepart, int nbPersonne, Client client) {
        this.idReservation = idReservation;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.nbPersonne = nbPersonne;
        this.client = client;
    }
    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public void setNbPersonne(int nbPersonne) {
        this.nbPersonne = nbPersonne;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
