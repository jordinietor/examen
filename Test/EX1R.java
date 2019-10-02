/**
 * EX1 repas
 */
public class EX1R {

    public static void main(String[] args) {
        int num;

        System.out.println("Entra un valor: ");

        num = Integer.parseInt( System.console().readLine());
        if (num % 2 == 0) {
            System.out.println("El valor és Parell");
        } else {
            System.out.println("El valor és Senar");
        }
    }
}