package models;

public class Generaliste extends Medecin {
    private String service;

    public Generaliste() {
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    public String affiche(){
        super.affiche();
        return"le service est :"+service;
    }
    
}
