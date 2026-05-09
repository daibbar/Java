package tp3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Maison maison = new Maison(null, 0, 0, 0, 0, false);
        LocalCommercial commercial = new LocalCommercial(null, 0, 0, null, false, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("=== Maison ===\n");
        System.out.print("addresse: ");
        maison.addresse = scanner.nextLine();
        System.out.print("surface: ");
        maison.surface = scanner.nextInt();
        System.out.print("prix d'achat: ");
        maison.prixAchat = scanner.nextInt();
        System.out.print("nombre des pieces: ");
        maison.nombrePieces = scanner.nextInt();
        System.out.print("a une piscine: ");
        maison.aUnePiscine = scanner.nextBoolean();
        System.out.print("surface du jardin: ");
        maison.surfaceJardin = scanner.nextInt();
        maison.calculeValeurLocative();
        maison.affiche();


        scanner.nextLine();
        System.out.print("=== Commercial ===\n");
        System.out.print("addresse: ");
        commercial.addresse = scanner.nextLine();
        System.out.print("surface: ");
        commercial.surface = scanner.nextInt();
        System.out.print("prix d'achat: ");
        commercial.prixAchat = scanner.nextInt();
        System.out.print("type locale: ");
        scanner.nextLine();
        commercial.type = scanner.nextLine();
        System.out.print("location meublée: ");
        commercial.locationMeuble = scanner.nextBoolean();
        System.out.print("loyer mensuel actuel: ");
        commercial.loyerMensuelActuel = scanner.nextInt();
        commercial.calculeValeurLocative();
        commercial.affiche();

        scanner.close();

    }
}
