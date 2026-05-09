package tp3;


public class BienImmobilier {
    String addresse;
    int surface;
    int prixAchat;
    double valeurLocativeEstime;

    public BienImmobilier() {

    }

    public BienImmobilier(String addresse, int surface, int prixAchat)
    {
        this.addresse = addresse;
        this.surface = surface;
        this.prixAchat = prixAchat;
    }

    public void affiche() {
        System.out.printf("{addresse: %s, surface: %d, prixAchat: %d, valeurLocativeEstime: %f,", 
                            addresse, surface, prixAchat, valeurLocativeEstime);
    }

    public void calculeValeurLocative() {
        valeurLocativeEstime = 0.5 * prixAchat / 100;
    }

}