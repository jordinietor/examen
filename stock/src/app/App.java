package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, ArrayList<Object>> stock = new HashMap<>();
        Map<Integer, ArrayList<Object>> clients = new HashMap<>();
        Map<Integer, ArrayList<Object>> factura = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int opcio;
        int nifc = 0;
        int key;
        int id = 0;

        lup: while (true) {

            mostraMenu();

            opcio = scan.nextInt();
            scan.nextLine();
            loop: switch (opcio) {
            case 1:

                while (true) {

                    ArrayList<Object> al1 = new ArrayList<>();

                    System.out.println(" Afegir Clients ");

                    System.out.println(" Introdueix el NIF: (0 per sortir) ");
                    nifc = scan.nextInt();
                    scan.nextLine();
                    if (nifc == 0) {
                        break loop;
                    }

                    System.out.println(" Introdueix el Nom del Client: ");
                    al1.add(scan.nextLine());

                    System.out.println(" Introdueix el Cognom Client: ");
                    al1.add(scan.nextLine());

                    System.out.println(" Introdueix el Tel Client: ");
                    al1.add(scan.nextLine());

                    System.out.println(" Introdueix el Nacionalitat Client: ");
                    al1.add(scan.nextLine());

                    clients.put(nifc, al1);

                    break;
                }

            case 2:
                mostrarclients(clients);
                break;

            case 3:
                mostrarclients(clients);

                System.out.println("Quin NIF vols eliminar");
                key = scan.nextInt();

                eliminarclient(key, clients);

                break;

            case 4:

                while (true) {

                    ArrayList<Object> al2 = new ArrayList<>();

                    System.out.println("Introdueix Stock");

                    System.out.println("Introdueix la referencia ID (0 per sortir)");
                    id = scan.nextInt();
                    scan.nextLine();
                    if (id == 0) {
                        break loop;
                    }

                    System.out.println("Introdueix la descripció del producte: ");
                    al2.add(scan.nextLine());

                    System.out.println("Introdueix la quantitat: ");
                    al2.add(scan.nextInt());

                    System.out.println("Introdueix la preu: ");
                    al2.add(scan.nextFloat());

                    stock.put(id, al2);

                    break;
                }

            case 5:
                mostrarstock(stock);
                break;

            case 6:
                mostrarstock(stock);

                System.out.println("Quina ID vols eliminar: ");
                id = scan.nextInt();
                
                eliminarstock(id, stock);
                break;

            case 7:

                break;

            case 8:

                break lup;

            }
        }
        scan.close();
    }

    public static void mostraMenu() {
        System.out.println("###############################");
        System.out.println("#            Menu             #");
        System.out.println("###############################");
        System.out.println("#                             #");
        System.out.println("# 1 - Afegir Clients          #");
        System.out.println("# 2 - Mostrar Clients         #");
        System.out.println("# 3 - Eliminar clients        #");
        System.out.println("# 4 - Afagir Stock            #");
        System.out.println("# 5 - Mostrar Stock           #");
        System.out.println("# 6 - Eliminar Stock          #");
        System.out.println("# 7 - Llistar Factures        #");
        System.out.println("# 8 - Sortir                  #");
        System.out.println("###############################");
    }

    public static void mostrarclients(Map<Integer, ArrayList<Object>> clients) {
        clients.forEach((k, v) -> {
            System.out.print("NIF " + k);

            for (Object object : v) {
                int c = v.indexOf(object);
                switch (c) {
                case 0:
                    System.out.print(" Nom: ");
                    break;

                case 1:
                    System.out.print(" Cognom: ");
                    break;

                case 2:
                    System.out.print(" Tel: ");
                    break;

                case 3:
                    System.out.print(" Nacionalitat: ");
                    break;
                }
                System.out.print(object);
            }
            System.out.println();
        });
    }

    public static void mostrarstock(Map<Integer, ArrayList<Object>> stock) {
        stock.forEach((k, v) -> {
            System.out.print("ID " + k);

            for (Object object : v) {
                int c = v.indexOf(object);
                switch (c) {
                case 0:
                    System.out.print(" Descripció: ");
                    break;

                case 1:
                    System.out.print(" Quantitat: ");
                    break;

                case 2:
                    System.out.print(" Preu: ");
                    break;
                }
                System.out.print(object);
            }
            System.out.println();
        });
    }

    public static void eliminarclient(int key, Map<Integer, ArrayList<Object>> clients) {
        clients.remove(key);
        System.out.println("Operació realitzada");
    }

    public static void eliminarstock(int id, Map<Integer, ArrayList<Object>> stock) {
        stock.remove(id);
        System.out.println("Operació realitzada");
    }
}