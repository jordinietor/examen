import java.util.Random;

/**
 * EX8
 */
public class EX8 {
    
    public static void main(String[] args) {
        Random r = new Random();
        int numPremiat = r.nextInt(10);
        System.out.println("El numero premiat es: " + numPremiat);
        int arrayNums[] = new int[10];
        
        for (int i = 0; i < arrayNums.length; i++)
            arrayNums[i] = 2000;
        boolean trobat = false;
        int intens = 0;
        while (!trobat) {
            boolean coincidencia = false;
            int numAleatori = r.nextInt(10);
            int i = 0;
            for (i = 0; i < arrayNums.length; i++)
            {
                if (numAleatori == arrayNums[i]) {
                    coincidencia = true;
                }
            }
            if (coincidencia == false) {
                arrayNums[intens] = numAleatori;
                intens++;

                if (numAleatori == numPremiat) {
                    trobat = true;

                }
            } else {
                System.out.println("El numero trobat ja hi era:");
            }

        }
        System.out.println("Premi!!!!! El numero d'intents es: " + intens);
    }
}
