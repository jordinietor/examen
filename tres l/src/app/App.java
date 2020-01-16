package app;

import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        char taulell[][] = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
        char jugador;
        char maquina;
        char token;
        String jugadors[] = new String[2];
        String nom;
        String fitxa;
        String inici;
        int guañador = 0;

        System.out.println(" Introdueix el teu nom: ");
        nom = scan.nextLine();

        while (true) {
            System.out.println("Amb quina fitxa jugaras (X o O)");
            fitxa = scan.nextLine();
            if (fitxa.equalsIgnoreCase("X")) {
                jugador = 'X';
                maquina = 'O';
                break;
            } else if (fitxa.equalsIgnoreCase("O")) {
                jugador = 'O';
                maquina = 'X';
                break;
            }
        }
        System.out.println("Escull qui começa J o M");
        inici = scan.nextLine();
        while (true) {
            if (inici.equalsIgnoreCase("J")) {
                token = jugador;
                break;
            } else if (inici.equalsIgnoreCase("M")) {
                token = maquina;
                break;
            }
        }

        while (guañador == 0) {
            imprimirtaulell(taulell);
            if (guañador != 0) {
                break;
            }
            switch (token) {
            case 'X':
                if (token == jugador) {
                    tornjugador(token, taulell, nom);
                } else if (token == maquina) {
                    tornMaquina(taulell, token);
                }
                token = 'O';
                break;

            case 'O':
                if (token == jugador) {
                    tornjugador(token, taulell, nom);
                } else if (token == maquina) {
                    tornMaquina(taulell, token);
                }
                token = 'X';
                break;
            }
        }
    }

    public static void imprimirtaulell(char taulell[][]) {
        System.out.println("#########################");
        System.out.println("#   " + taulell[0][0] + "   |   " + taulell[0][1] + "   |   " + taulell[0][2] + "   #");
        System.out.println("#-----------------------#");
        System.out.println("#   " + taulell[1][0] + "   |   " + taulell[1][1] + "   |   " + taulell[1][2] + "   #");
        System.out.println("#-----------------------#");
        System.out.println("#   " + taulell[2][0] + "   |   " + taulell[2][1] + "   |   " + taulell[2][2] + "   #");
        System.out.println("#########################");
    }

    public static void tornJugador(String nom, char[][] taulell, char token) {
        String cordenades2 = " ";
        if (numbuits(taulell) == 3) {
            while (true) {
                System.out.println("torn " + nom);
                System.out.println("mou una fitxa? (les cordenades de 0 al 2 i separades per '-')");
                cordenades2 = sc.nextLine();
                if (cordenades2.matches("[0-2]-[0-2]")) {
                    String[] cordenades = cordenades2.split("-");
                    if (fitchaJugador(cordenades, taulell, token)) {
                        taulell[Integer.parseInt(cordenades[0])][Integer.parseInt(cordenades[1])] = ' ';
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("A on bols Posar la fitcha");
            String novacordenades = sc.nextLine();
            if (novacordenades.matches("[0-2]-[0-2]") && !novacordenades.equalsIgnoreCase(cordenades2)) {
                String[] cordenada = novacordenades.split("-");
                if (buit(cordenades, taulell)) {
                    taulell[Integer.parseInt(cordenades[0])][Integer.parseInt(cordenades[1])] = token;
                    break;
                }
            }

        }
    }

    public static void tornMaquina(char[][] taulell, char token) {
        Random r = new Random();
        String cordenadessecun = " ";
        String[] cordenades = new String[2];
        if (numbuits(taulell) == 3) {
            while (true) {
                for (int i = 0; i < cordenades.length; i++) {
                    cordenades[i] = String.valueOf(r.nextInt(3));
                }
                if (fitchaJugador(cordenades, taulell, token)) {
                    taulell[Integer.parseInt(cordenades[0])][Integer.parseInt(cordenades[1])] = ' ';
                    break;
                }
            }
        }
        while (true) {
            String[] xy = new String[2];
            for (int i = 0; i < xy.length; i++) {
                xy[i] = String.valueOf(r.nextInt(3));
            }
            if (!Arrays.equals(cordenades, xy)) {
                if (buit(cordenades, taulell)) {
                    taulell[Integer.parseInt(cordenades[0])][Integer.parseInt(cordenades[1])] = token;
                    break;
                }
            }

        }
    }

    public static Boolean fitchaJugador(String[] cordenades, char[][] taulell, char fitchajugador) {
        return taulell[Integer.parseInt(cordenades[0])][Integer.parseInt(cordenades[1])] == fitchajugador;
    }

    public static boolean buit(String cordenades[], char taulell[][]) {
        return taulell[Integer.parseInt(cordenades[0])][Integer.parseInt(cordenades[1])] == ' ';
    }

    public static int numbuits(char taulell[][]) {
        int quantitat = 0;
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[0].length; j++) {
                if (taulell[i][j] == ' ') {
                    quantitat++;
                }
            }
        }
        return quantitat;
    }
}
