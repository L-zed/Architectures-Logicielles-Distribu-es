package model;

import java.util.Date;

public class Offre {

    private String idOffre;
    private String hotel;
    private String typeChambre;
    private int numeroChambre;
    private Date debutDisponibilite;
    private Date arrivee;
    private Date depart;
    private double prix;
    private String roomImage;
    private int nbPersonnes;

    public Offre(String idOffre, String hotel, String typeChambre, int numeroChambre, String roomImage,
                 Date debutDisponibilite, Date arrivee, Date depart, double prix, int nbPersonnes) {
        this.idOffre = idOffre;
        this.hotel = hotel;
        this.typeChambre = typeChambre;
        this.numeroChambre = numeroChambre;
        this.roomImage = roomImage;
        this.debutDisponibilite = debutDisponibilite;
        this.arrivee = arrivee;
        this.depart = depart;
        this.prix = prix;
        this.nbPersonnes = nbPersonnes;
    }


    public String getIdOffre() {
        return idOffre;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public Date getDebutDisponibilite() {
        return debutDisponibilite;
    }

    public double getPrix() {
        return prix;
    }

    public void setIdOffre(String idOffre) {
        this.idOffre = idOffre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

    public void setDebutDisponibilite(Date debutDisponibilite) {
        this.debutDisponibilite = debutDisponibilite;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getArrivee() {
        return arrivee;
    }

    public void setArrivee(Date arrivee) {
        this.arrivee = arrivee;
    }

    public Date getDepart() {
        return depart;
    }

    public void setDepart(Date depart) {
        this.depart = depart;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRoomImage() {
        return roomImage;
    }

    public void setRoomImage(String roomImage) {
        this.roomImage = roomImage;
    }

    @Override
    public String toString() {
        return "Offre{" +
                "idOffre='" + idOffre + '\'' +
                ", hotel='" + hotel + '\'' +
                ", typeChambre='" + typeChambre + '\'' +
                ", numeroChambre=" + numeroChambre +
                ", debutDisponibilite=" + debutDisponibilite +
                ", arrivee=" + arrivee +
                ", depart=" + depart +
                ", prix=" + prix +
                ", nbPersonnes=" + nbPersonnes +
                '}';
    }

}
