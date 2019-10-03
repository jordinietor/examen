/**
 * EX9R
 */
public class EX9R {

    public static void main(String[] args) {
        int[] array = new int[5];
        int posicio = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            int m = array[i];
            for (int x = i; x < array.length; x++) {
                if (m > array[x]) {
                    m = array[x];
                    posicio = x;
                }
            }
            array[posicio] = array[i];
            array[i] = m;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posició " + i + " el numero " + array[i]);
        }
    }
}