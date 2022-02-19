package model;

public class Agence {
    private String id;
    private String passowrd;

    public Agence(String id, String passowrd) {
        this.id = id;
        this.passowrd = passowrd;
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
}