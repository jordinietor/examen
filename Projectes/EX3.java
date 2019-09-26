public class EX3 {

    public static void main(String[] args) {
        String nom;
        int edat;
        char sexe;

        System.out.println("Introdueix el teu nom: ");
        nom = System.console().readLine();

        System.out.println("Introdueix la teva edat: ");
        edat = Integer.parseInt(System.console().readLine());

        System.out.println("Introdueix el teu sexe M/F: ");
        sexe = System.console().readLine().charAt(0);

        if (edat <= 16) {
            if ((sexe == 'M') || (sexe == 'm')) {
                System.out.println("Voste Senyor/a " + nom + " pertany a la categoria Juvenil Masculi");
            } else if ((sexe == 'F') || (sexe == 'f')) {
                System.out.println("Voste Senyor/a " + nom + " pertany a la categoria Juvenil Femeni");
            } else {
                System.out.println("La teva categoria es ERROR");
            }
        } else if (edat < 65) {
            if ((sexe == 'M') || (sexe == 'm')) {
                System.out.println("Voste Senyor/a " + nom + " pertany a la categoria Sènior Masculi");
            } else if ((sexe == 'F') || (sexe == 'f')) {
                System.out.println("Voste Senyor/a " + nom + " pertany a la categoria Sènior Femeni");
            } else {
                System.out.println("La teva categoria es ERROR");
            }
        } else {
            if ((sexe == 'M') || (sexe == 'm')) {
                System.out.println("Voste Senyor/a " + nom + " pertany a la categoria Veterà Masculi");
            } else if ((sexe == 'F') || (sexe == 'f')) {
                System.out.println("Voste Senyor/a " + nom + " pertany a la categoria Veterà Femeni");
            } else {
                System.out.println("La teva categoria es ERROR");
            }
        }
    }
}