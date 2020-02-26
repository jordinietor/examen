package shop.classes;

public class StockProducte {

    private int idstock, quantitatEnStock;
    private Producte producte;

    public StockProducte(int idstock) {
        this.idstock = idstock;
    }

    public int getIdstock() {
        return idstock;
    }

    public void setIdstock(int idstock) {
        this.idstock = idstock;
    }

    public int getQuantitatEnStock() {
        return quantitatEnStock;
    }

    public void setQuantitatEnStock(int quantitatEnStock) {
        this.quantitatEnStock = quantitatEnStock;
    }

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }

    public void addNewStock(int quantitat) {
        this.quantitatEnStock = quantitatEnStock + quantitat;
    }

    public void showStockProducte() {
        System.out.println("Referencia " + this.getProducte().getRef());
        System.out.println("Producte " + this.getProducte().getProducte());
        System.out.println("Descripció " + this.getProducte().getDescripcio());
        System.out.println("Preu " + this.getProducte().getPreu());

    }
}