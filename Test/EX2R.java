/**
 * EX2R
 */
public class EX2R {

    public static void main(String[] args) {
        String frase;

        System.out.println("Entra una frase: ");

        frase = System.console().readLine();
        System.out.println("La longitud de la teva fraser és: "+frase.length()+" caracters");
    }
}