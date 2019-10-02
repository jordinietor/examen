/**
 * EX5R
 */
public class EX5R {

    public static void main(String[] args) {
        String R1 = "Asistent";
        String R2 = "Lefya Virdis";
        String R3 = "full";        
        String R;
        int Punts = 0;

        System.out.println("Pregunta 1:");
        System.out.println("Que treu en Niet en els multis?");
        R = System.console().readLine();
        if (R.equalsIgnoreCase(R1)) {
            Punts++;
            System.out.println("Bé");
            System.out.println("Pregunta 2:");
            System.out.println("Quin es l'unic personatge de 4 d'en Niet?");
            R = System.console().readLine();
            if (R.equalsIgnoreCase(R2)) {
                Punts++;
                System.out.println("Bé");
                System.out.println("Pregunta 3:");
                System.out.println("Estat d'en Jūshirō Ukitake? ");
                R = System.console().readLine();                
                    if (R.equalsIgnoreCase(R3)) {
                        Punts++;
                        System.out.println("Molt Bé 3/3");

                    } else {
                        System.out.println("Has fallat");
                        System.out.println("Has aconseguit: "+Punts+" Punts");
                    }
                } else {
                    System.out.println("Has fallat");
                    System.out.println("Has aconseguit: "+Punts+" Punts");
                }
            }
        }
    }

