/**
 * EXarraymulti
 */
public class EXarraymulti {

    public static void main(String[] args) {
        int [][] arrayb = new int [2][10];
        int [] arrayu = new int [10];

        for (int i = 0; i < arrayb.length; i++) {
            for (int j = 0; j < arrayb [0].length; j++) {
                arrayb[i][j] = x.nextin (10);
            }
        }
        for (int j = 0; j < arrayb.length; j++) {
            int resultat = arrayb [0][j] + arrayb [1][j];
            arrayu[j] = resultat;
        }
       
    }
}