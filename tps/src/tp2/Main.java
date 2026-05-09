package tp2;
import java.util.Scanner;



public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void afficherTableau (int[] tableau) {
        for (int  i = 0; i < tableau.length; i++) {
            System.out.printf("%d\n", tableau[i]);
        }
    }


    public static void ex1 () {
        String text;
        String mot;

        System.out.print("donner un text: ");
        text = scanner.nextLine();
        System.out.print("donner un mot: ");
        mot = scanner.nextLine();

        switch (mot) {
            case "UNIVERSITE":
                text = text.replace("UNIVERSITE", "");
                break;  

            case "FACULTE":
                text = text.replace("FACULTE", "UNIVERSITE");
                break;
    
            case "ECOLE":
                text = text + "ECOLE";
                break;
            default :
                System.out.println("Opération non reconnue");
        }
        System.out.printf("text: %s\n", text);
        scanner.close();
    }

    public static void main (String args[]) {
        int[] arr = {1, 5 , 4};
        int taille;
        int[] tableau;
        
        afficherTableau(arr);
        System.out.printf("donner la taille du tableau: ");
        taille = scanner.nextInt();
        tableau = new int[taille];

        for (int i = 0; i < taille; i++) {
            System.out.printf("la valeur suivante: ");
            tableau[i] = scanner.nextInt();
        }

        afficherTableau(tableau);
    }

}
