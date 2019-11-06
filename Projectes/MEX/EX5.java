/**
 * EX5
 */
public class EX5 {

    public static void main(String[] args) {
        /*
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
         * for (int j = 0; j < i; j++) { 
         * System.out.println(array[j]); }
         * System.out.println("Numero total de valors: "+i);
         

        for (int j = 0; j <= i; j++) {
            if (array[j] >= 0) {
                sp = sp + array[j];
                System.out.println("La suma dels valors positius: "+sp);
            } else {
                sn = sn + array[j];
                System.out.println("La suma dels valors negatius: "+sn);
            }
            if (array[j] % 2 == 0) {
                spar = spar + array[j];
                System.out.println("La suma dels valors parells: "+spar);
            } else {
                ss = ss + array[j];
                System.out.println("La suma dels valors senars: "+ss);
            }
        }
        */
        int array[] = new int[5];
        int i = 0, cp = 0, cn = 0, cpar = 0, csen = 0, sp = 0, sn = 0, spar = 0, ssen = 0, mitjana;
        String resposta;
        boolean sortir = false;

        while (!sortir) {
            System.out.println("Entra un valor:");
            array[i] = Integer.parseInt(System.console().readLine());
            boolean triar = false;
            while (!triar) {
                System.out.println("Vols introduir mes valors:");
                resposta = System.console().readLine();
                if (resposta.equalsIgnoreCase("No") || resposta.equalsIgnoreCase("N")) {
                    triar = true;
                    sortir = true;
                }else if (resposta.equalsIgnoreCase("Si") || resposta.equalsIgnoreCase("S")) {
                    triar = true;
                }else{
                    System.out.println("Valor invalid");
                }
            }
        i++;
        if (i == array.length) {
        sortir = true;
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        System.out.println("Valors Totals: " + i);
        for (int j = 0; j < i; j++) {
            if (array[j] > 0) {
                System.out.println(j + " Valor Positiu");
                cp++;
                sp = sp + array[j];
            }else{
                System.out.println(j + " Valor Negatiu");
                cn++;
                sn = sn + array[j];
            }
            if (array[j] % 2 == 0) {
                System.out.println(j + " Valor Parell");
                cpar++;
                spar = spar + array[j];
            }else{
                System.out.println(j + " Valor Senar");
                csen++;
                ssen = ssen + array[j];
            }
        }
    }
}