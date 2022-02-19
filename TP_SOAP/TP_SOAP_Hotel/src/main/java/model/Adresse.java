package model;

public class Adresse {
    private int numeroRue;
    private String rue;
    private int codePostal ;
    private String ville ;
    private String pays;
    private String posisionGps;

    public Adresse(int numeroRue, String rue, int codePostal, String ville, String pays, String posisionGps) {
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
        this.posisionGps=posisionGps;
    }
//GETTERS AND SETTERS
    public int getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPosisionGps() {
        return posisionGps;
    }

    public void setPosisionGps(String posisionGps) {
        this.posisionGps = posisionGps;
    }

    //Methodes
    @Override
    public String toString() {
        return "Adresse{" +
                "numeroRue=" + numeroRue +
                ", rue='" + rue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ", posisionGps='" + posisionGps + '\'' +
                '}';
    }
}




