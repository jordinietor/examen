/**
 * EX1
 */
public class MEX1 {

    public static void main(String[] args) {
        int num;
        int acumulat = 1;

        System.out.println("Introdueix el nombre que vols calcular el seu factorial");
        num = Integer.parseInt(System.console().readLine());

        for (int i = num; i > 0; i--) {
            acumulat = i * acumulat;
        }
        System.out.println(acumulat);
    }
}