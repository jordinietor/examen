import java.util.Scanner;

/**
 * EX3
 */
public class EX3 {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdueix un valor: ");
        num = scan.nextInt();

        if (num >= 0) {
            System.out.println("Positiu");
        } else {
            System.out.println("Negatiu");
        }
        if (num % 2 == 0) {
            System.out.println("Parell");
        } else {
            System.out.println("Senar");
        }
        scan.close();
    }
}