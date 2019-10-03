import java.text.DecimalFormat;

/**
 * EX6R
 */
public class EX6R {

    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, nota5, mitjana, exf;
        DecimalFormat trunc = new DecimalFormat("#.00");

        System.out.println("Introdueix la nota del Prime parcial: ");
        nota1 = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix la nota del Segon parcial: ");
        nota2 = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix la nota del Tercer parcial: ");
        nota3 = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix la nota del Quart parcial: ");
        nota4 = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix la nota del Cinque parcial: ");
        nota5 = Float.parseFloat(System.console().readLine());

        mitjana = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("Introdueix la nota del ultim examen: ");
        exf = Float.parseFloat(System.console().readLine());

        System.out.println("La nota final és: " + trunc.format((mitjana * 0.4) + (exf * 0.6)));
    }
}