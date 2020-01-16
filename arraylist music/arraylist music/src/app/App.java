package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
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

                introartistsong(llista, cantants, songs, vots, id, vot);

                break;

            case 2:
                imprimeixArraylist(llista, vots);
                break;
            case 3:
                imprimeixArraylist(llista, vots);
                votar(id, vot);
                break;
            case 4:

               

                break;

            }
        }
    }

    public static void introartistsong(ArrayList<ArrayList<String>> llista, ArrayList<String> cantants,ArrayList<String> songs, ArrayList<ArrayList<Integer>> vots, ArrayList<Integer> id, ArrayList<Integer> vot  ) {
        System.out.println("Introdueix el cantant");
        scan.nextLine();
        cantants.add(scan.nextLine());

        System.out.println("Introdueix la canço");
        songs.add(scan.nextLine());

        id.add(songs.size());
        vot.add(0);

    }

    public static void imprimeixArraylist(ArrayList<ArrayList<String>> llista,  ArrayList<ArrayList<Integer>> vots) {
        for (int i = 0; i < llista.get(0).size(); i++) {
            System.out.println(" - ID: "+ vots.get(0).get(i)+
                " - Cantant: "+ llista.get(0).get(i)+ 
                    " - Titol cançó: "+ llista.get(1).get(i)+ 
                        " - vots: " + vots.get(1).get(i));

        }

    }

    public static void votar(ArrayList<Integer> id, ArrayList<Integer> vot) {

        System.out.println("Quina cançó vols votar? (ID)");
        int varid = scan.nextInt();
        scan.nextLine();

        if (id.contains(varid)) {
            vot.set(id.indexOf(varid), vot.get(id.indexOf(varid)) + 1);

        }
    }
}