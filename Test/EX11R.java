/**
 * EX11R
 */
public class EX11R {

    public static void main(String[] args) {
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Estas en la posició: "+i);
            array[i] = System.console().readLine();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posició " +i+" el numero " + array[i]);
        }
    }
}