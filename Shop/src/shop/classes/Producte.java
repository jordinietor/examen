package shop.classes;

public class Producte {

    private String ref, producte, descripcio;
    private float preu;

    public Producte(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getProducte() {
        return producte;
    }

    public void setProducte(String producte) {
        this.producte = producte;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }
}