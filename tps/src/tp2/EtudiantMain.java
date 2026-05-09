package tp2;
import java.util.Scanner;

public class EtudiantMain {
    public static float claculerMoyenne(Etudiant[] etudiants) {
        float totale;

        totale = 0;
        for (int i =0; i < etudiants.length; i++) {
            totale += etudiants[i].getNote();
        }

        return totale / etudiants.length;
    }


    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        int nbrEtudiants;
        Etudiant[] etudiants;


        System.out.printf("le nombre des etudiants: ");
        nbrEtudiants = scanner.nextInt();
        etudiants = new Etudiant[nbrEtudiants];

        for (int i = 0; i < etudiants.length; i++){
            etudiants[i] = new Etudiant();
        
            System.out.printf("ajouter l'id d'etudiant %d: ", i);
            etudiants[i].setId(scanner.nextInt());

            System.out.printf("ajouter le nom d'etudiant %d: ", i);
            scanner.nextLine();
            etudiants[i].setNom(scanner.nextLine());

            System.out.printf("ajouter la note d'etudiant %d: ", i);
            etudiants[i].setNote(scanner.nextFloat());
        }

        for (int i = 0; i < etudiants.length; i++){
            System.out.println(etudiants[i].toString());
        }

        System.out.printf("la moyenne totale des eutidiants: %f\n", 
                    claculerMoyenne(etudiants));

        System.out.printf("l'index d'etudiant numero 1: ");
        int i = scanner.nextInt();
        System.out.printf("l'index d'etudiant numero 2: ");
        int j = scanner.nextInt();
        if (etudiants[i].equals(etudiants[j])) System.out.println("les deux etudiants sont identiques");
        else System.out.println("les deux etudiants ne sont pas identiques");
        
        scanner.close();
    }
}