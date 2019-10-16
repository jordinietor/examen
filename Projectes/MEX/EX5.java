import sun.security.util.Cache.EqualByteArray;

import java.util.Scanner;

/**
 * EX5
 */
public class EX5 {

    public static void main(String[] args) {
        int array[] = new int[10];
        int i = 0;
        String resp;
        boolean s = false;

        while (!s) {

            System.out.println("Introdueix un valor: ");
            array[i] = Integer.parseInt(System.console().readLine());
            boolean t = false;
            while (!t) {
                resp = System.console().readLine("Vols introduir mes valors: ");
                if (resp.equalsIgnoreCase("No") || resp.equalsIgnoreCase("N")) {
                    t = true;
                    s = true;
                } else if ((resp.equalsIgnoreCase("Si") || resp.equalsIgnoreCase("S"))) {
                    t = true;
                } else {
                    System.out.println("No es valid");
                }

            }
            i++;
            if (i == array.length) {
                s = true;
            }
        }
        // Mostrar valors Array
        /*
         * for (int j = 0; j < i; j++) { System.out.println(array[j]); }
         * System.out.println("Numero total de valors: "+i);
         */

        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 0) {
                System.out.println("Positiu");
            } else {
                System.out.println("Negatiu");
            }
            if (array[j] % 2 == 0) {
                System.out.println("Parell");
            } else {
                System.out.println("Senar");
            }
        }
    }
}