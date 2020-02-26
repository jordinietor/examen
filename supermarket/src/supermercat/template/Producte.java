package supermercat.template;

public class Producte {

    private String nom;
    private float preu;

    public Producte(String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return "Producte nom=" + nom + ", preu=" + preu;
    }

    public float calcular(int quantitat) {
        float preuarticle = this.preu * quantitat;
        return preuarticle;
    }
}