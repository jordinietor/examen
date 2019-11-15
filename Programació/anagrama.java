import java.util.Random;

/**
 * anagrama
 */
public class anagrama {

    public static void main(String[] args) {
        char taulell[] = new char[9];
        Random r = new Random();
        int num, cv = 0, cc = 0;
        

        for (int i = 0; i < taulell.length; i++) {
        num = r.nextInt(2);
        System.out.println(num);
        if (num == 0 && cv <= 4) {
            cv++;
        } else {
            cc++;
            }
        }
        
        System.out.println(taulell);
        System.out.println("Numero de Vocals" + cv);
        System.out.println("Numero de Consonats" + cc);
    }
}