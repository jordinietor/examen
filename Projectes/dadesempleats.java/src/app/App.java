package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String array[][] = new String[7][20];
        int edat[] = new int[20];
        int opcio;
        int j = 0;
        Scanner op = new Scanner(System.in);
        Scanner resp = new Scanner(System.in);
        boolean entra = true;

        System.out.println("Tria menu");
 

    loop:   
    while (entra == true) {

        System.out.println("1- Afegir usuari");
        System.out.println("2- Login");
        System.out.println("3- Sortir");
        System.out.println("4- Inutil");

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

                    System.out.println("Introdueix l'Usuari");
                    array[5][j] = resp.nextLine();

                    System.out.println("Introdueix Password");
                    array[6][j] = resp.nextLine();
                
                    System.out.println(array);
                break;
            case 2:
                System.out.println("Login");
                break;
            case 3:
                System.out.println("Sortir");
                break loop;
        
            default:
                System.out.println("Tria menu");
                break;
            }
        }
        op.close();
    }
}