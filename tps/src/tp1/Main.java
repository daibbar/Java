package tp1;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void Q2() {
        int i;

        i = -3;
        while (true){
            System.out.println(i*i);
            if (i <= 3) {
                i++;
                continue;
            }
            else break;
        }
    }

    public static void Q1() {
        int     valeurs;
        double  currentValue;

        valeurs = 0;
        while(true){
            System.out.printf("enter the next number: ");
            currentValue = scanner.nextDouble();
            if(currentValue == 0) break;
            valeurs += (int)currentValue;
        }
        System.out.printf("totale = %d", valeurs);
    }

    public static void Q3() {
        for(int i = 0; i <= 10; i+= 2){
            System.out.printf("racine de %d, %f\n", i, Math.sqrt(i));
        }
    }

    public static void Q4() {
        int nbr;
        int factor;

        nbr = scanner.nextInt();
        if (nbr == 0){
            System.out.printf("0! = 1\n");
        }

        factor = 1;
        for (int i = 1; i <= nbr; i++){
            factor *= i;
        }
        System.out.printf("%d! = %d\n", nbr, factor);
    }

    public static void Q5() {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[3];
        String operator;
        
        System.out.print("saisi trois nombres:\n");
        for (int i = 0; i < 3; i++){
            System.out.print("> ");
            values[i] = scanner.nextDouble();
        }

        scanner.nextLine();
        System.out.printf("choisis un operateur (*, +, -): ");
        operator = scanner.nextLine();

        switch (operator) {
            case "*":
                System.out.printf("resultat: %f\n", values[0]*values[1]*values[2]);
                break;

            case "+":
                System.out.printf("resultat: %f\n", values[0] + values[1] + values[2]);
                break;

            case "-":
                System.out.printf("resultat: %f\n", values[0] - values[1] - values[2]);
                break;
        
            default:
                break;
        }
        scanner.close();
    }


    public static void Q6() 
    {
        Produit P1 = new Produit(1, "parfum", 500, "Dior");
        Produit P2 = new Produit(2, "parfum", 700, "Versace");

        P1.augmenter(3);
        P2.diminuer(3);

        P1.afficheProduit();
        P2.afficheProduit();
    }


    public static void main(String args[])
    {
        int question;

        do {
            System.out.println("\n--- Menu des Questions ---");
            System.out.println("1. Somme de nombres (Q1)");
            System.out.println("2. Carrés de -3 à 3 (Q2)");
            System.out.println("3. Racines carrées de 0 à 10 (Q3)");
            System.out.println("4. Calcul de factorielle (Q4)");
            System.out.println("5. Calculatrice simple (Q5)");
            System.out.println("6. La Classe Produit (Q6)");

            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            
            question = scanner.nextInt();

            switch (question){
                case 1: Q1(); break;
                case 2: Q2(); break;
                case 3: Q3(); break;
                case 4: Q4(); break;
                case 5: Q5(); break;
                case 6: Q6(); break;
                case 0: System.out.println("Au revoir !"); break;
                default: System.out.println("Choix invalide, réessayez.");
            }
        } while (question != 0);
        scanner.close();
    }
    
    
}
