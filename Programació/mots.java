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
        String nom;
        String paraula;
        int rondes;

        System.out.println(" 2 jugadors:");

        System.out.println("Introdueix el numero de rondes:");
        rondes = scan.nextInt();
        taulell = new String[2][rondes];

        for (int i = 0; i < noms.length; i++) {
            System.out.println("Introdueix el nom J" + (i + 1) + ": ");
            noms[i][0] = scan.next();
        }
        System.out.println("\n");
        System.out.println("--------------------");

        for (int j = 0; j < noms.length; j++) {

            System.out.print(noms[j][0] + "\t\t");
        }
        System.out.println("\n");
        System.out.println("--------------------");
        
        scan.close();
    }
}