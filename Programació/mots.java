import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * mots
 */
public class mots {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String taulell[][];
        String noms[][] = new String[2][2];
        String lletres;
        String paraula;
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
        paraula = scan.next();

        joc:
        for (int i = 0; i < rondes; i++) {
            for (int j = 0; j < noms.length; j++) {
                lletres = car(paraula);
                System.out.println("Torn del jugador " + (j + 1) + ":");
                System.out.println("Introdueix la paraula començant per " + lletres);
                paraula = scan.next();
                if (paraula.startsWith(lletres)){
                    taulell[j][i] = paraula;
                    noms[j][1] = String.valueOf(i + 1);
                }else{
                    break joc;
                }
            }
        }
        System.out.println("\n");
        System.out.println("--------------------");

        scan.close();
    }

    public static String car(String paraula) {
        String lletres = paraula.substring(paraula.length()-2);
        return lletres;
    }

    public static void puntuacio(String[][] punts) {
        for (int i = 0; i < punts.length; i++) {
            for (int j = 0; j < punts.length; j++) {
                System.out.println(punts[j][i]);
            }
        }
    }
}