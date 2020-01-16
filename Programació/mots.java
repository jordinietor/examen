import java.util.Scanner;

/**
 * mots
 */
public class mots {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String taulell[][];
        String noms[][] = new String[2][2];
        int rondes;

        System.out.println(" 2 jugadors:");

        System.out.println("Introdueix el numero de rondes:");
        rondes = scan.nextInt();
        taulell = new String[2][rondes];

        for (int i = 0; i < noms.length; i++) {
            System.out.println("Introdueix el nom J" + (i + 1) + ": ");
            noms[i][0] = scan.next();
            noms[i][1] = "0";
        }
        System.out.println("\n");
        System.out.println("--------------------");
        System.out.println("Amb quina paraula vols començar?");
        String paraula = scan.next();

        joc: for (int i = 0; i < rondes; i++) {
            for (int j = 0; j < noms.length; j++) {
                String lletres = car(paraula);
                System.out.println("Ronda " + (i + 1));
                System.out.println("Torn del jugador " + noms[j][0] + " :");
                System.out.println("Introdueix la paraula començant per " + lletres);

                paraula = scan.next();
                if (paraula.startsWith(lletres)) {
                    taulell[j][i] = paraula;
                    noms[j][1] = String.valueOf(i + 1);
                } else {
                    break joc;
                }
            }
        }
        System.out.println("\n");
        System.out.println("--------------------");
        puntuacio(taulell, noms);
        scan.close();
    }

    public static String car(String paraula) {
        String lletres = paraula.substring(paraula.length() - 2);
        return lletres;
    }

    public static void puntuacio(String[][] taula, String[][] noms) {
        for (int i = 0; i < taula.length; i++) {
            System.out.print("\n");
            for (int j = -1; j <= taula[0].length; j++) {
                if (j == -1) {
                    System.out.print(noms[i][0] + "\t");
                } else if (j == taula[0].length) {
                    System.out.print(noms[i][1]);
                } else {
                    if (taula[i][j] != null) {
                        System.out.print(taula[i][j] + "\t");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}