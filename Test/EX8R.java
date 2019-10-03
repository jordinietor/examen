/**
 * EX8R
 */
public class EX8R {

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posició " +i+" el numero " + array[i]);
        }
    }
}