package tp1;

public class Produit {
    int Code;
    String Intitule;
    float Prix;
    String Marque;

    public Produit (int Code, String Intitule, float Prix, String Marque){
        this.Code = Code;
        this.Intitule = Intitule;
        this.Prix = Prix;
        this.Marque = Marque;
    }

    public Produit(int Code, float Prix){
        this.Code = Code;
        this.Prix = Prix;
    }


    public float getPrixProduit(){
        return Prix;
    }

    public String getMarqueProduit() {
        return Marque;
    }
    

    public void afficheProduit() {
        System.out.printf("Code: %d, Intitule: %s, Prix: %f, Marque: %s\n", 
            Code, Intitule, Prix, Marque
        );
    }

    public boolean augmenter(int M){
        if (M > Prix * 5 / 100) return false;
        Prix += M;
        return true;
    }

    public boolean diminuer (int N) {
        if (Prix <= 100) return false;
        Prix -= N * Prix / 100;
        return true;
    }
}
