package shop.funcions;

import java.util.ArrayList;

import shop.classes.Clients;
import shop.classes.StockProducte;;

public class Funcions {

    public static void mostraMenu() {
        System.out.println("###############################");
        System.out.println("#            Menu             #");
        System.out.println("###############################");
        System.out.println("# 1 - Afagir Stock            #");
        System.out.println("# 2 - Mostrar Stock           #");
        System.out.println("# 3 - Eliminar Stock          #");
        System.out.println("# 4 - Afegir Client           #");
        System.out.println("# 5 - Mostrar Client          #");
        System.out.println("# 6 - Eliminar Client         #");
        System.out.println("# 7 - Imprimir Factura        #");
        System.out.println("# 8 - Sortir                  #");
        System.out.println("###############################");
    }

    public static boolean checkProducInWarehouse(ArrayList<StockProducte> alsp, String ref) {
        for (StockProducte s : alsp) {
            if (s.getProducte().getRef().equals(ref)) {
                return true;
            }
        }

        return false;
    }

    public static StockProducte checkSXPByRef(ArrayList<StockProducte> alsp, String ref) {
        for (StockProducte s : alsp) {
            if (s.getProducte().getRef().equals(ref)) {
                return s;
            }
        }
        return null;
    }

    public static void showArraylistOfSXP(ArrayList<StockProducte> alsp) {
        for (StockProducte s : alsp) {
            System.out.println("--------------------------");
            s.showStockProducte();
            System.out.println("--------------------------");
        }
    }

    public static boolean checkClientInRegist(ArrayList<Clients> alc, String dni) {
        for (Clients s : alc) {
            if (s.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }

    public static Clients checkAlcByDni(ArrayList<Clients> alc, String dni) {
        for (Clients s : alc) {
            if (s.getDni().equals(dni)) {
                return s;
            }
        }
        return null;
    }

    public static void showArraylistOfClients(ArrayList<Clients> alc) {
        for (Clients s : alc) {
            System.out.println("----------------------------");
            s.showClient();
            System.out.println("----------------------------");
        }
    }

    

}