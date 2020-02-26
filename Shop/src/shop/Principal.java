package shop;

import java.util.ArrayList;
import java.util.Scanner;
import shop.classes.*;
import shop.funcions.Funcions;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        ArrayList<StockProducte> alsp = new ArrayList<>();
        ArrayList<Clients> alc = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcio;
        String ref;
        while (true) {
            Funcions.mostraMenu();
            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {

            case 1:
                loop: while (true) {
                    System.out.print("Introdueix ref (0 per tornar al menu): ");
                    ref = scan.nextLine();
                    Producte pr;
                    int idstock = 1;
                    int quantitat;
                    StockProducte sxp;
                    if (ref.equals("0")) {
                        break loop;
                    }
                    if (Funcions.checkProducInWarehouse(alsp, ref)) {
                        System.out.print("Introdueix la quantitat: ");
                        quantitat = scan.nextInt();
                        scan.nextLine();
                        sxp = Funcions.checkSXPByRef(alsp, ref);
                        sxp.addNewStock(quantitat);

                    } else {
                        pr = new Producte(ref);
                        System.out.print("Introdueix el producte: ");
                        pr.setProducte(scan.nextLine());
                        System.out.print("Introdueix la descripció: ");
                        pr.setDescripcio(scan.nextLine());
                        System.out.print("Introdueix el preu: ");
                        pr.setPreu(scan.nextFloat());
                        scan.nextLine();
                        System.out.print("Introdueix la quantitat: ");
                        quantitat = scan.nextInt();
                        scan.nextLine();

                        sxp = new StockProducte(idstock);
                        idstock++;
                        sxp.setProducte(pr);
                        sxp.setQuantitatEnStock(quantitat);
                        alsp.add(sxp);

                    }

                }
                break;

            case 2:
                Funcions.showArraylistOfSXP(alsp);

                break;

            case 3:
                Funcions.showArraylistOfSXP(alsp);
                System.out.println("Sobre quina referencia vols eliminar: ");
                String cref = scan.nextLine();
                if (Funcions.checkProducInWarehouse(alsp, cref)) {
                    alsp.remove(Funcions.checkSXPByRef(alsp, cref));
                } else {
                    System.out.println("No s'ha trobat producte ");
                }

                break;

            case 4:
                loop: while (true) {

                    System.out.println("Introdueix DNI");
                    String dni = scan.nextLine();
                    Clients cl;
                    if (dni.equals("0")) {
                        break loop;
                    }
                    if (Funcions.checkClientInRegist(alc, dni)) {
                        System.out.println(" El DNI: " + dni + " Ja esta registrat ");
                    } else {
                        cl = new Clients(dni);
                        System.out.println("Introdueix el nom del client:");
                        cl.setNom(scan.nextLine());
                        System.out.println("Introdueix el cognom del client:");
                        cl.setCognom(scan.nextLine());

                        // System.out.println("Introdueix la data de neixement del client:");
                        // cl.setAniv(scan.nextLine());

                        System.out.println("Introdueix el telefon del client:");
                        cl.setTlf(scan.nextLine());
                        System.out.println("Introdueix la població del client:");
                        cl.setPoblació(scan.nextLine());

                        alc.add(cl);
                    }
                }

                break;

            case 5:
                Funcions.showArraylistOfClients(alc);

                break;

            case 6:
                Funcions.showArraylistOfClients(alc);
                System.out.println("Sobre quin dni vols eliminar la informació: ");
                String cdni = scan.nextLine();
                if (Funcions.checkClientInRegist(alc, cdni)) {
                    alc.remove(Funcions.checkAlcByDni(alc, cdni));
                } else {
                    System.out.println("No s'ha trobat el DNI ");
                }

                break;

            case 7:

                break;

            case 8:

                break;
            }
        }
    }
}
