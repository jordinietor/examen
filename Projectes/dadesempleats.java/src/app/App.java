package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String array[][] = new String[7][20];
        String usuari;
        String contra;
        int edat[] = new int[20];
        int opcio;
        int j = 0;
        Scanner op = new Scanner(System.in);
        Scanner resp = new Scanner(System.in);
        boolean entra = true;


        loop: while (entra == true) {
            System.out.println("Tria menu");
            System.out.println("1- Afegir usuari");
            System.out.println("2- Login");
            System.out.println("3- Sortir");
            opcio = op.nextInt();

            switch (opcio) {
            case 1:
                System.out.println("Afegir usuari");

                System.out.println("Introdueix el Nom");
                array[0][j] = resp.nextLine();

                System.out.println("Introdueix el Cognom");
                array[1][j] = resp.nextLine();

                System.out.println("Introdueix la teva Adreça");
                array[2][j] = resp.nextLine();

                System.out.println("Introdueix la teva Població");
                array[3][j] = resp.nextLine();

                System.out.println("Introdueix la teva Data de Naixament");
                array[4][j] = resp.nextLine();

                boolean guardar = false;
                while (!guardar) {
                    guardar = true;
                    System.out.println("Introdueix l'Usuari");
                    usuari = resp.nextLine();
                    for (int i = 0; i < array[0].length; i++) {
                        if (usuari.equalsIgnoreCase(array[5][i])) {
                            System.out.println("Error Usuari ja identificat");
                            guardar = false;
                            
                        }
                    }
                    array[5][j] = usuari;
                    
                }
                
                while (true) {
                    System.out.println("Introdueix Password");
                    contra = resp.nextLine();
                    for (int i = 0; i < array[0].length; i++) {
                        if (contra.equals(array[6][i])) {
                            System.out.println("Error Contrasenya ja utilitzada");
                            guardar = true;
                            contra = array[6][i];
                            break;
                        }
                    }
                    break;
                }
                j++;
                break;
            case 2:
                System.out.println("Login");
                System.out.println("\n");

                for (int k = 0; k < array.length; k++) {
                    for (int i = 0; i < array[0].length; i++) {
                        System.out.print(array[k][i] + "\t");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                System.out.println("Sortir");
                break loop;

            default:
                break;
            }
        }
        op.close();
    }
}