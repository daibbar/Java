package tp3;


public class LocalCommercial extends BienImmobilier {
    String type;
    boolean locationMeuble;
    double loyerMensuelActuel;

    public LocalCommercial(String addresse, int surface, int prixAchat,
                            String type, boolean locationMeuble, double loyerMensuelActuel)
    {
            super(addresse, surface, prixAchat);
            this.type = type;
            this.locationMeuble = locationMeuble;
            this.loyerMensuelActuel = loyerMensuelActuel;
    }

    public void affiche() {
        super.affiche();
        System.out.printf(" type: %s, locationMeuble: %b, loyerMensuelActuel: %f}\n",type, locationMeuble, loyerMensuelActuel);
    }

    public void calculeValeurLocative() {
        valeurLocativeEstime = prixAchat * 0.0008;
        if (locationMeuble) valeurLocativeEstime += 15 * valeurLocativeEstime / 100;
        else if (type == "Boutique") valeurLocativeEstime += 5 * valeurLocativeEstime / 100;
        else if (type == "Entrepot") valeurLocativeEstime -= 10 * valeurLocativeEstime / 100;

        if (valeurLocativeEstime  < 0) valeurLocativeEstime = 0;
        
    }
}