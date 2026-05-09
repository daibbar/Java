package tp4;

public class VehiculeThermique extends Vehicule {
    private double niveauCarburant;
    private String typeCarburant;
    private int cylindree;


    public VehiculeThermique(String immatriculation, int capacite, double consommationBase,
                        double niveauCarburant, String typeCarburant, int cylindree) {
        super(immatriculation, capacite, consommationBase);
        this.niveauCarburant = niveauCarburant;
        this.typeCarburant = typeCarburant; // <-- Ajout de cette ligne manquante
        this.cylindree = cylindree;
}
    public double getNiveauCarburant() {
        return niveauCarburant;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public int getCylindree() {
        return cylindree;
    }

    public void setNiveauCarburant(double niveauCarburant) {
        this.niveauCarburant = niveauCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }
    public double calculerAutonomie() {
        return niveauCarburant * 100 / super.getConsommationBase();
    }

    public double calculerEfficacite() {
        return super.getCapacite() * 100 / super.getConsommationBase() * cylindree / 1000;
    }

    public double calculerPollution() {
        return super.getConsommationBase() * cylindree * 0.02;
    }



}
