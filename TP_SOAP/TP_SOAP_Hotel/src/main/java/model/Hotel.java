package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    //Attributs
    private String name;
    private int nbEtoile;
    private Adresse adresse ;
    private List<Chambre> chambres;
    private List<Offre> offresProposees;
    private List<Agence> agencesPartenaires;


    //Constructor
    public Hotel(String name, Adresse adresse , int nbEtoile, List<Chambre> chambres, List<Agence> agencesPartenaires) {
        this.name = name;
        this.adresse = adresse;
        this.nbEtoile = nbEtoile;
        this.chambres = chambres;
        this.agencesPartenaires = agencesPartenaires;
        this.offresProposees = new ArrayList<>();
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getNbEtoile() {
        return nbEtoile;
    }

    public void setNbEtoile(int nbEtoile) {
        this.nbEtoile = nbEtoile;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public List<Offre> getOffresProposees() {
        return offresProposees;
    }

    public void setOffresProposees(ArrayList<Offre> offresProposees) {
        this.offresProposees = offresProposees;
    }

    public List<Agence> getAgencesPartenaires() {
        return agencesPartenaires;
    }

    public void setAgencesPartenaires(List<Agence> agencesPartenaires) {
        this.agencesPartenaires = agencesPartenaires;
    }

    //Methodes

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", nombre d'etoile=" + nbEtoile +
                ", " + adresse.toString() +
                '}';
    }
}
