package models;

public abstract class Medecin implements IAffiche {
    private int id;
    protected String nom;
    protected String prenom;
    protected String dateRecrutement;
    private static int nombrMedecin;
    //Many to one 
    private Hopital hopital;
    
    public Medecin() {
        id=++nombrMedecin;
    }
    public Hopital getHopital() {
        return hopital;
    }
    public void setHopital(Hopital hopital) {
        this.hopital = hopital;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public String getDateRecrutement() {
        return dateRecrutement;
    }
    public void setDateRecrutement(String dateRecrutement) {
        this.dateRecrutement = dateRecrutement;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String affiche(){
        return "Le nom est :"+nom+" le prenom est : "+prenom+" la date de recrutement"+dateRecrutement+"id est "+id;
    }
    

    
}
