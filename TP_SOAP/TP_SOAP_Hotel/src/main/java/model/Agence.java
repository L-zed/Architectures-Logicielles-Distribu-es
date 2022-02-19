package model;

public class Agence {
    private String id;
    private String passowrd;
    private Double pricePercentage;

    public Agence(String id, String passowrd, Double pricePercentage) {
        this.id = id;
        this.passowrd = passowrd;
        this.pricePercentage = pricePercentage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    public Double getPricePercentage() {
        return pricePercentage;
    }

    public void setPricePercentage(Double pricePercentage) {
        this.pricePercentage = pricePercentage;
    }
}
