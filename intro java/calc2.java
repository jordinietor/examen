import java.util.Scanner;

/**
 * calc2
 */
public class calc2 {

    public static void main(String[] args) {

        Scanner pantalla=new Scanner(System.in);

        float valor1;
        valor1=pantalla.nextFloat();
        System.out.println("El valor 1 es: "+valor1);

        float valor2;
        valor2=pantalla.nextFloat();
        System.out.println("El valor 2 es: "+valor2);

        float valor3;
        valor3=pantalla.nextFloat();
        System.out.println("El valor 3 es: "+valor3);

        float suma;
        float resta;
        float multi;
        float divi;

        suma = valor1 + valor2;
        System.out.println("El resultat de la suma entre : "+valor1+valor2+suma);
        resta = valor3 - valor2;
        System.out.println("El resultat de la resta entre : "+valor3+valor2+resta);
        multi = valor2 * valor1;
        System.out.println("El resultat de la multi entre : "+valor2+valor1+multi);
        divi = valor3 / valor1;
        System.out.println("El resultat de la divi entre : "+valor3+valor1+divi);

        pantalla.close();
    }
}
