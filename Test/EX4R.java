/**
 * EX4R
 */
public class EX4R {
    public static void main(String[] args) {
        int DNI;
        char[] lletre = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H','L', 'C', 'K', 'E' };

        System.out.println("Entra numero del DNI ");
        DNI = Integer.parseInt(System.console().readLine());

        System.out.println("La lletra del teu DNI sera: " + (lletre[DNI % 23]));
    }
}