package tp4;

import java.util.ArrayList;
import java.util.ListIterator;

public class GestionTransport {
    public static void main(String args[]){
        ArrayList<VehiculeThermique> vehiculeThermiques = new ArrayList<>(3);
        ArrayList<VehiculeElectrique> vehiculeElectriques = new ArrayList<>(3); 
        
        vehiculeThermiques.add(new VehiculeThermique("ABC-123", 5, 6.5, 25.0, "Essence", 1200));
        vehiculeThermiques.add(new VehiculeThermique("XYZ-789", 2, 12.0, 40.0, "Diesel", 3000));
        vehiculeThermiques.add(new VehiculeThermique("DEF-456", 5, 5.0, 15.5, "Essence", 1000));
        
        vehiculeElectriques.add(new VehiculeElectrique("ELEC-01", 5, 15.0, 75, 45, 6));
        vehiculeElectriques.add(new VehiculeElectrique("TESL-99", 5, 18.0, 100, 80, 2));
        vehiculeElectriques.add(new VehiculeElectrique("CITY-22", 2, 10.0, 40, 20, 8));
        
        
        for (VehiculeElectrique vehiculeElectrique : vehiculeElectriques) {

        }
    }
    
}
