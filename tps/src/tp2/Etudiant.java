package tp2;

public class Etudiant {
    private int id;
    private String nom;
    private float note;

    public Etudiant () {

    }
    
    public Etudiant (int id, String nom, float note) {
        this.id = id;
        this.nom = nom;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getNote() {
        return note;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public String toString() {
        return String.format("Etudiant {id=%d, nom=%s, note=%f}\n", id, nom, note);
    }


    public boolean equals(Etudiant obj) {
        if (!(obj.id == id && obj.nom == nom && obj.note == note)) return false;
        return true;
    }

}