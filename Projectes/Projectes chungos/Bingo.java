import java.util.Random;

public class Bingo {
    public static void main(String[] args) throws Exception {
        int[][] array = new int[3][9];
        int[] bolabingo = new int[89];
        int[] ablanc = new int[9];
        String[][] mostra = new String[3][9];
        Random random = new Random();
        
        boolean linia = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                boolean sortir = false;
                while (!sortir) {
                    int n = random.nextInt(10) + (10 * j);
                    boolean guardar = true;
                    for (int k = 0; k < array.length; k++) {
                        if (n == array[k][j]) {
                            guardar = false;
                            break;
                        }
                    }
                    if (guardar) {
                        array[i][j] = n;
                        sortir = true;
                    }
                }
            }
        }

        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] > array[i + 1][j]) {
                        int xula = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = xula;
                    }
                }
            }
        }

        for (int i = 0; i < ablanc.length; i++) {
            ablanc[i] = 7;
        }

        for (int i = 0; i < ablanc.length; i++) {
            boolean sortir = false;
            while (!sortir) {
                int var = random.nextInt(3);
                int contador = 0;
                for (int j = 0; j < ablanc.length; j++) {
                    if (ablanc[j] == var) {
                        contador++;
                    }
                }
                if (contador < 3) {
                    ablanc[i] = var;
                    sortir = true;
                }
            }
        }

        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (i == ablanc[j]) {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < mostra.length; i++) {
            for (int j = 0; j < mostra[0].length; j++) {
                if (array[i][j] == 0) {
                    mostra[i][j] = "x";
                } else {
                    mostra[i][j] = String.valueOf(array[i][j]);
                }
            }
        }
        
        boolean bingo = false;
        while (!bingo) {
            int bola = random.nextInt(89) + 1;
            

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("\t" + mostra[i][j]);
            }
            System.out.print('\n');
        }
    }
}