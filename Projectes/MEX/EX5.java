/**
 * EX5
 */
public class EX5 {

    public static void main(String[] args) {
        int array[] = new int[11];
        int i = 0, sp = 0, sn = 0, spar = 0, ss = 0;
        String resp;
        boolean sortir = false;

        while (!sortir) {

            System.out.println("Introdueix un valor: ");
            array[i] = Integer.parseInt(System.console().readLine());
            boolean tria = false;
            while (!tria) {
                resp = System.console().readLine("Vols introduir mes valors: ");
                if (resp.equalsIgnoreCase("No") || resp.equalsIgnoreCase("N")) {
                    tria = true;
                    sortir = true;
                } else if ((resp.equalsIgnoreCase("Si") || resp.equalsIgnoreCase("S"))) {
                    tria = true;
                } else {
                    System.out.println("No es valid");
                }
            }
            i++;
            if (i == array.length) {
                sortir = true;
            }
        }
        // Mostrar valors Array
        /*
         * for (int j = 0; j < i; j++) { System.out.println(array[j]); }
         * System.out.println("Numero total de valors: "+i);
         */

        for (int j = 0; j <= i; j++) {
            if (array[j] >= 0) {
                sp = array[j];
                System.out.println("La suma dels valors positius: "+sp);
            } else {
                sn = array[j];
                System.out.println("La suma dels valors positius: "+sn);
            }
            if (array[j] % 2 == 0) {
                spar = array[j];
                System.out.println("La suma dels valors positius: "+spar);
            } else {
                ss = array[j];
                System.out.println("La suma dels valors positius: "+ss);
            }
        }
    }
}