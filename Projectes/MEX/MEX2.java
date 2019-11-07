import java.util.Scanner;

/**
 * EX2
 */
public class MEX2 {

    public static void main(String[] args) {

        int suma1 = 0, suma2 = 0, resp;
        int array[] = new int[101];
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdueix un valor de 0 a 100: ");
        resp = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < (resp+1); i++) {
            if (array[i] % 2 == 0) {
                suma1 = suma1 + array[i];
            } else {
                suma2 = suma2 + array[i];
            }
        }
        System.out.println("suma dels valors parells: " + suma1 + " suma dels valors senars: " + suma2);
        scan.close();
    }
}