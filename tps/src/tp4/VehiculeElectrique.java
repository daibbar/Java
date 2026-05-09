package tp4;

public class VehiculeElectrique extends Vehicule{
    private double niveauBatterie;
    private int tempsRecharge;
    private int capaciteBatterie;


    public VehiculeElectrique(String immatriculation, int capacite, double consommationBase,
                              double niveauBatterie, int tempsRecharge, int capaciteBatterie) {
        super(immatriculation, capacite, consommationBase);
        this.niveauBatterie = niveauBatterie;
        this.tempsRecharge = tempsRecharge;
        this.capaciteBatterie = capaciteBatterie;
    }

    public double calculerAutonomie() {
        return niveauBatterie * 100 / (super.getConsommationBase() * 0.8);

    }

    public double calculerEfficacite() {
        return (super.getCapacite() * this.calculerAutonomie()) / (capaciteBatterie * tempsRecharge / 60);
    }

    public double calculerTempsRecharge() {
        return tempsRecharge * (1 - niveauBatterie / capaciteBatterie);
    }
}
