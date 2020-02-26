package supermercat;

import java.time.LocalDate;
import java.util.ArrayList;

import supermercat.template.ProductAmbCaducitat;
import supermercat.template.Producte;
import supermercat.template.ProdSenseCaducitat;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Producte> alp = new ArrayList<>();

        alp.add(new Producte("producte 1", 3.10f));
        alp.add(new ProductAmbCaducitat("producte 2", 5.10f, LocalDate.of(2020, 2, 22)));
        alp.add(new ProdSenseCaducitat("Producta 3", 3.23f, "Moble"));

        float total = 0;
        for (Producte pr : alp) {
            total = pr.calcular(10);

        }
        System.out.println("El total es: " + total);
    }
}