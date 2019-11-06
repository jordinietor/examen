/*import java.util.Scanner;

/**
 * EX4
 */
public class EX4 {

    public static void main(String[] args) {
        /*  
      int array[] = new int[5];
      Scanner scan = new Scanner(System.in);
      int suma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introdueix un valor " + (i + 1) + ":");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            suma = suma + array[i];
        }
        System.out.println("La suma dels nombres és:" + suma);
        for (int i = (array.length - 1); i >= 0; i--) {
            System.out.println(array[i]);

        }
        scan.close();
        */

        int array[] = new int [5];
        int suma = 0;

            for (int i = 0; i < array.length; i++) {
                System.out.println("Introdueix un valor" + (i + 1) + ":");
                array[i] = Integer.parseInt(System.console().readLine());
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                suma = suma + array[i];
            }
            System.out.println("La suma dels valors és: " + suma);
            for (int i = (array.length - 1); i >= 0; i--) {
                System.out.println(array[i]);
            }
    }
}
