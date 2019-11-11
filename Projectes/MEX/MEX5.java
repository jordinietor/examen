/**
 * EX5
 */
public class MEX5 {

    public static void main(String[] args) {
        /*
         * int array[] = new int[11]; int i = 0, sp = 0, sn = 0, spar = 0, ss = 0;
         * String resp; boolean sortir = false;
         * 
         * while (!sortir) {
         * 
         * System.out.println("Introdueix un valor: "); array[i] =
         * Integer.parseInt(System.console().readLine()); boolean tria = false; while
         * (!tria) { resp = System.console().readLine("Vols introduir mes valors: "); if
         * (resp.equalsIgnoreCase("No") || resp.equalsIgnoreCase("N")) { tria = true;
         * sortir = true; } else if ((resp.equalsIgnoreCase("Si") ||
         * resp.equalsIgnoreCase("S"))) { tria = true; } else {
         * System.out.println("No es valid"); } } i++; if (i == array.length) { sortir =
         * true; } } // Mostrar valors Array /* for (int j = 0; j < i; j++) {
         * System.out.println(array[j]); }
         * System.out.println("Numero total de valors: "+i);
         * 
         * 
         * for (int j = 0; j <= i; j++) { if (array[j] >= 0) { sp = sp + array[j];
         * System.out.println("La suma dels valors positius: "+sp); } else { sn = sn +
         * array[j]; System.out.println("La suma dels valors negatius: "+sn); } if
         * (array[j] % 2 == 0) { spar = spar + array[j];
         * System.out.println("La suma dels valors parells: "+spar); } else { ss = ss +
         * array[j]; System.out.println("La suma dels valors senars: "+ss); } }
         */
        int array[] = new int[5];
        int xula = 0, cp = 0, cn = 0, cpar = 0, csen = 0, sp = 0, sn = 0, spar = 0, ssen = 0;
        String resposta;
        boolean sortir = false;

        while (!sortir) {
            System.out.println("Entra un valor:");
            array[xula] = Integer.parseInt(System.console().readLine());
            boolean triar = false;
            while (!triar) {
                System.out.println("Vols introduir mes valors:");
                resposta = System.console().readLine();
                if (resposta.equalsIgnoreCase("No") || resposta.equalsIgnoreCase("N")) {
                    triar = true;
                    sortir = true;
                } else if (resposta.equalsIgnoreCase("Si") || resposta.equalsIgnoreCase("S")) {
                    triar = true;
                } else {
                    System.out.println("Valor invalid");
                }
            }
            xula++;
            if (xula == array.length) {
                sortir = true;
            }
        }

        System.out.println("Valors Totals: " + xula);
        for (int i = 0; i < xula; i++) {
            if (array[i] >= 0) {
                System.out.print("Valor " + array[i] +" és Positiu");
                cp++;
            } else {
                System.out.print("Valor " + array[i] +" és Negatiu");
                cn++;
            }
            if (array[i] % 2 == 0) {
                System.out.print(" i Parell");
                cpar++;
            } else {
                System.out.print(" i Senar");
                csen++;
            }
            System.out.print('\n');
        }
    }
}