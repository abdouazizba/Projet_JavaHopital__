package models;

public class Specialiste extends Medecin {
    private String specialiste;
    private int nombrAnnee;
    public Specialiste() {
    }
    public String getSpecialiste() {
        return specialiste;
    }
    public int getNombrAnnee() {
        return nombrAnnee;
    }
    public void setNombrAnnee(int nombrAnnee) {
        this.nombrAnnee = nombrAnnee;
    }
    public void setSpecialiste(String specialiste) {
        this.specialiste = specialiste;
    }
    public String affiche(){
        super.affiche();
        return "le specialiste est :"+specialiste+" le nombre d'annéé est :"+nombrAnnee;
    }
    
}
