public class  prova{
    public static void main (String[] args) {
        String[][] taula = {{"Hola", "casa"},{"laca", "sac"}};
        String[][] noms = {{"jordi", "0"},{"Clajer", "2"}};

        for (int i = 0; i < taula.length; i++) {
            System.out.print("\n");
            for (int j = -1; j <= taula[0].length; j++) {
                if (j == -1){
                    System.out.print(noms[i][0] + "\t");
                } else if (j == taula[0].length){
                    System.out.print("pep");
                } else {
                    System.out.print(taula[i][j] + "\t");
                }
            }
            System.out.print("\n");
        }
    }
}