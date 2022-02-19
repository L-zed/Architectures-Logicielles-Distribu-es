package model;

public class Client {
    private String nom;
    private String prenom;

    public Client() {
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    //GETTERS AND SETTERS

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
