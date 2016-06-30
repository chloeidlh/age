public class Etudiant {

    private String nom;

    private String prenom;

    private String adresse;

    private int anneedenaissance ;

    public int annee = 2016 ;

    private int age;

    public Etudiant(String nom, String prenom, String adresse, int anneedenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.anneedenaissance = anneedenaissance;

    }

    public int getAnnee() {
        return anneedenaissance;
    }

    public void setAnnee(int anneedenaissance) {
        this.anneedenaissance = anneedenaissance;
    }

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int calculAge() {
        int age = annee-anneedenaissance;
        return age;
    }



}
