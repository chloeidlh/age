public class Main {

    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant("Le Morvan", "Chloé", "3T, rue des Ferblantiers", 1993);
        System.out.println("Etudiant n°1 :");
        System.out.println("Nom : " + etudiant1.getNom());
        System.out.println("Prénom : " + etudiant1.getPrenom());
        System.out.println("Adresse : " + etudiant1.getAdresse());
        System.out.println("Age : " + etudiant1.calculAge());
    }

}
