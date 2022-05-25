package models;

public abstract  class Hopital implements IAffiche {
    private int id;
    private String nom;
    private String adresse;
    private static int nombre;
    //one to many
    public Hopital() {
        id=++nombre;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String affiche(){
        return"Le nom est : "+nom+" le l'adresse est "+adresse+" l'id est "+id;
    }


    
}
