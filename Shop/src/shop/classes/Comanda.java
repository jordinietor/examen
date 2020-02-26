package shop.classes;

import java.time.LocalDateTime;

public class Comanda {

    private LocalDateTime ldt;
    private Clients clients;
    private Producte producte, descripcio;

    public Comanda(Clients clients) {
        this.clients = clients;
    }

    public LocalDateTime getLdt() {
        return ldt;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Producte getProducte() {
        return producte;
    }

    public void setProducte(Producte producte) {
        this.producte = producte;
    }

    public Producte getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(Producte descripcio) {
        this.descripcio = descripcio;
    }

}
