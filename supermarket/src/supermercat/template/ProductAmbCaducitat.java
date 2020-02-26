package supermercat.template;

import java.time.LocalDate;

import supermercat.generic.suport;

public class ProductAmbCaducitat extends Producte {
    private LocalDate datacaducitat;

    public ProductAmbCaducitat(String nom, float preu, LocalDate datacaducitat) {
        super(nom, preu);
        this.datacaducitat = datacaducitat;
    }

    public LocalDate getDatacaducitat() {
        return datacaducitat;
    }

    public void setDatacaducitat(LocalDate datacaducitat) {
        this.datacaducitat = datacaducitat;
    }

    @Override
    public String toString() {
        return super.toString() + "caducitat " + datacaducitat.toString();
    }

    @Override
    public float calcular(int quantitat) {
        float preufinal = super.calcular(quantitat);
        int diesCaducitat = suport.calculaDies(this.datacaducitat);
        switch (diesCaducitat) {
        case 1:
            preufinal -= (preufinal * 0.75f);
            System.out.println("Descompte 75% ");
            break;

        case 2:
            preufinal -= (preufinal * 0.5f);
            System.out.println("Descompte 50% ");
            break;
        case 3:
            preufinal -= (preufinal * 0.25f);
            System.out.println("Descompte 25% ");
            break;
        case 4:
            preufinal -= (preufinal * 0.10f);
            System.out.println("Descompte 10% ");
            break;
        }
        System.out.println("Preu Article: " + preufinal);
        return preufinal;
    }

}