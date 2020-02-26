package shop.classes;

public class LineaComanda {

    private int idlinea;
    private float preufinal;
    private int quantitat;
    private Producte producte;

    public LineaComanda(int idlinea) {
        this.idlinea = idlinea;
    }

    public int getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(int idlinea) {
        this.idlinea = idlinea;
    }

    public float getPreufinal() {
        return preufinal;
    }

    public void setPreufinal(float preufinal) {
        this.preufinal = preufinal;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }

}