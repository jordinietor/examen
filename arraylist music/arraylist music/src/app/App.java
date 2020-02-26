package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int cuntador = 1;
        ArrayList<ArrayList<String>> llista = new ArrayList<ArrayList<String>>();
        ArrayList<String> cantants = new ArrayList<String>();
        ArrayList<String> songs = new ArrayList<String>();

        llista.add(cantants);
        llista.add(songs);

        ArrayList<ArrayList<Integer>> vots = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> id = new ArrayList<Integer>();
        ArrayList<Integer> vot = new ArrayList<Integer>();

        vots.add(id);
        vots.add(vot);

        int val;

        loop: while (true) {

            System.out.println("Menu");
            System.out.println("0- Sortir");
            System.out.println("1- Introdueix cantant i canço");
            System.out.println("2- Mostra informacio de l'Arraylis");
            System.out.println("3- Votar cançó");
            System.out.println("4- Eliminar cançó");

            val = scan.nextInt();

            switch (val) {
            case 0:
                break loop;

            case 1:
                cuntador = introartistsong(llista, cantants, songs, vots, id, vot, cuntador);
                break;

            case 2:
                imprimeixArraylist(llista, vots);
                break;

            case 3:
                imprimeixArraylist(llista, vots);
                votar(id, vot);
                break;

            case 4:
                eliminar(llista, cantants, songs, vots, id, vot);
                break;

            }
        }
    }

    public static int trobarID(ArrayList<Integer> llistaIDs, int id) {
        int tid = llistaIDs.indexOf(id);
        return tid;
    }

    public static void eliminar(ArrayList<ArrayList<String>> llista, ArrayList<String> cantants,
            ArrayList<String> songs, ArrayList<ArrayList<Integer>> vots, ArrayList<Integer> id,
            ArrayList<Integer> vot) {
        imprimeixArraylist(llista, vots);
        System.out.println("Quina cançó vols votar? (ID)");
        int varid = scan.nextInt();
        scan.nextLine();

        if (id.contains(varid)) {
            int tid = trobarID(id, varid);
            vot.remove(tid);
            id.remove(tid);
            vots.set(0, id);
            vots.set(1, id);

            cantants.remove(tid);
            songs.remove(tid);
            llista.set(0, cantants);
            llista.set(1, songs);
        }
    }

    public static int introartistsong(ArrayList<ArrayList<String>> llista, ArrayList<String> cantants,
            ArrayList<String> songs, ArrayList<ArrayList<Integer>> vots, ArrayList<Integer> id, ArrayList<Integer> vot,
            int cuntador) {
        System.out.println("Introdueix el cantant");
        scan.nextLine();
        cantants.add(scan.nextLine());

        System.out.println("Introdueix la canço");
        songs.add(scan.nextLine());

        id.add(cuntador);
        vot.add(0);

        return cuntador + 1;
    }

    public static int votmax(ArrayList<ArrayList<Integer>> vots) {
        int valor = vots.get(1).get(0);
        for (int i = 0; i < vots.get(1).size(); i++) {
            if (valor < vots.get(1).get(i)) {
                valor = vots.get(1).get(i);
            }
        }
        return valor;
    }

    public static void imprimeixArraylist(ArrayList<ArrayList<String>> llista, ArrayList<ArrayList<Integer>> vots) {
        for (int i = votmax(vots); i >= 0; i--) {
            for (int j = 0; j < vots.get(1).size(); j++) {
                if (i == vots.get(1).get(j)) {
                    System.out.println(" - ID: " + vots.get(0).get(j) + " - Cantant: " + llista.get(0).get(j)
                            + " - Titol cançó: " + llista.get(1).get(j) + " - vots: " + vots.get(1).get(j));
                }
            }
        }
    }

    public static void votar(ArrayList<Integer> id, ArrayList<Integer> vot) {

        System.out.println("Quina cançó vols votar? (ID)");
        int varid = scan.nextInt();
        scan.nextLine();

        if (id.contains(varid)) {
            int tid = trobarID(id, varid);
            vot.set(tid, vot.get(tid) + 1);
        }
    }
}