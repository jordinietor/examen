package app;

import java.util.Random;
import java.util.Scanner;

public class App {
    static final int numParaules = 3;
    static final int numLletresAbecedari = 26;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String arrayParaules[] = new String[numParaules];
        mostraBenvinguda();
        System.out.println("Introdueix la mida de les paraules: ");
        int mida = sc.nextInt();
        sc.nextLine();
        char arrayPanell[] = new char[mida];
        inicialitzaArrayPanell(arrayPanell); // L'inicialitza amb '_'
        char arrayLletresDites[] = new char[numLletresAbecedari];
        for (int i = 0; i < arrayParaules.length; i++) {
            boolean ok = false;
            while (!ok) {
                ok = true;
                System.out.println("Escriu una paraula número " + (i + 1));
                String paraula = sc.next();
                if (comprovaMidaParaula(paraula, mida)) {
                    arrayParaules[i] = paraula;

                } else {
                    System.out.println("Mida incorrecta. Has d'escriure paraules de " + mida + " caracters.");
                    ok = false;
                }
            }
        }

        String paraulaSecreta = triaParaulaSecretaRandom(arrayParaules);
        char arrayParaulaSecreta[] = deStringACharArray(paraulaSecreta); // Passa un String a array de chars

        int posicio = 0;
        int errors = 0;
        boolean estasPenjat = false;
        boolean hasTriunfat = false;
        while (!estasPenjat && !hasTriunfat) {
            mostraPanell(arrayPanell);
            char lletra;
            String valorEntrat;
            do {
                System.out.println("Introdueix una lletra");
                valorEntrat = sc.next();
                lletra = valorEntrat.charAt(0);

            } while (!(comprovaSiEsLletra(lletra) && comprovaSiNomesEsUnaSolaLletra(valorEntrat)
                    && comprovaSiJaHaDitLaLletra(lletra, arrayLletresDites)));

            afegeixLletraAArrayDeLletresDites(lletra, arrayLletresDites, posicio);
            posicio++;
            errors = actualitzaPanellAmbLletra(lletra, arrayParaulaSecreta, errors, arrayPanell);
            printaPenjat(errors);

            if (comprovaSiHasPalmat(errors)) {
                estasPenjat = true;
                sc.close();
            }

            if (comprovaSiHasGuanyat(arrayPanell)) {
                hasTriunfat = true;
                sc.close();
            }

        }

        if (hasTriunfat) {
            System.out.println("Felicitats! Has descobert la paraula amb " + errors + " errors.");
        } else {
            System.out.println("Collons.. No era tan difícil.. La paraula era: " + paraulaSecreta);
            System.out.println("Has palmat!");
        }
    }

    public static boolean comprovaSiHasGuanyat(char[] arrayPanell) {
        for (int i = 0; i < arrayPanell.length; i++) {
            if (arrayPanell[i] == '*') {
                return false;
            }
        }
        return true;
    }

    public static boolean comprovaSiHasPalmat(int errors) {
        return errors == 8;
    }

    public static void printaPenjat(int errors) {
        System.out.println("----------");
        System.out.print("|");
        if (errors > 0) {
            System.out.print("    |    ");
        }
        System.out.println();

        System.out.print("|");
        if (errors > 1) {
            System.out.print("    O    ");
        }
        System.out.println();

        System.out.print("|");
        if (errors > 2) {
            System.out.print("   /");
        }
        if (errors > 3) {
            System.out.print("|");
        }
        if (errors > 4) {
            System.out.print("\\    ");
        }
        System.out.println();

        System.out.print("|");
        if (errors > 5) {
            System.out.print("    |    ");
        }
        System.out.println();

        System.out.print("|");
        if (errors > 6) {
            System.out.print("   /");
        }
        if (errors > 7) {
            System.out.print(" \\    ");
        }
        System.out.println();

        System.out.print("|");
        System.out.println();
    }

    public static int actualitzaPanellAmbLletra(char lletra, char[] arrayParaulaSecreta, int errors,
            char[] arrayPanell) {

        boolean err = true;
        for (int i = 0; i < arrayPanell.length; i++) {
            if (arrayParaulaSecreta[i] == lletra) {
                arrayPanell[i] = lletra;
                err = false;
            }
        }

        if (err) {
            errors = errors + 1;
        }

        return errors;
    }

    public static void afegeixLletraAArrayDeLletresDites(char lletra, char[] arrayLletresDites, int posicio) {
        arrayLletresDites[posicio] = lletra;
    }

    public static boolean comprovaSiJaHaDitLaLletra(char lletra, char[] arrayLletresDites) {
        for (int i = 0; i < arrayLletresDites.length; i++) {
            if (lletra == arrayLletresDites[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean comprovaSiNomesEsUnaSolaLletra(String valorEntrat) {
        return valorEntrat.length() == 1;
    }

    public static boolean comprovaSiEsLletra(char lletra) {
        return Character.isLetter(lletra);
    }

    public static void mostraPanell(char[] arrayPanell) {
        for (int i = 0; i < arrayPanell.length; i++) {
            System.out.print(arrayPanell[i]);
        }
        System.out.println();
    }

    public static char[] deStringACharArray(String paraulaSecreta) {
        return paraulaSecreta.toCharArray();
    }

    public static String triaParaulaSecretaRandom(String arrayParaules[]) {
        Random r = new Random();
        return arrayParaules[r.nextInt(arrayParaules.length)];
    }

    public static boolean comprovaMidaParaula(String paraula, int mida) {
        return paraula.length() == mida;
    }

    private static void inicialitzaArrayPanell(char[] arrayPanell) {
        for (int i = 0; i < arrayPanell.length; i++) {
            arrayPanell[i] = '*';
        }
    }

    private static void mostraBenvinguda() {
        System.out.println("Benvinguts al penjat");
    }
}