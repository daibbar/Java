package tp3;

public class Maison extends BienImmobilier {
    int nombrePieces;
    int surfaceJardin;
    boolean aUnePiscine;

    public Maison(String addresse, int surface, int prixAchat, 
                  int nombrePieces, int surfaceJardin, boolean aUnePiscine){
            super(addresse, surfaceJardin, prixAchat);
            this.nombrePieces = nombrePieces;
            this.surfaceJardin = surfaceJardin;
            this.aUnePiscine = aUnePiscine;
    }

    public void affiche() {
        super.affiche();
        System.out.printf(" nombrePieces: %s, surfaceJardin: %b, aUnePiscine: %b}\n",nombrePieces, surfaceJardin, aUnePiscine);
    }

    public void calculeValeurLocative() {
        super.calculeValeurLocative();
        if (surfaceJardin > 50) valeurLocativeEstime += 10 * valeurLocativeEstime;
        if (aUnePiscine) valeurLocativeEstime += 20 * valeurLocativeEstime;

        if (valeurLocativeEstime  < 0) valeurLocativeEstime = 0;
    }
}