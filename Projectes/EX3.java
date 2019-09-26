public class EX3 {

    public static void main(String[] args) {
        String nom;
        int edat;
        char sexe;
        //String categoria;

        System.out.println("Introdueix el teu nom: ");
        nom = System.console().readLine();

        System.out.println("Introdueix el teu edat: ");
        edat = Integer.parseInt(System.console().readLine());

        System.out.println("Introdueix el teu sexe M/F: ");
        sexe = System.console().readLine().charAt(0);

        if (edat <= 16 && sexe == 'M' )
        {
            
            System.out.println("Categoria Juvenil Masculi");
                      
        }  else{
            System.out.println("Categoria Juvenil Femeni");
        }
        else if (edat > 16 && < 65 && sexe == 'M') {
            
            System.out.println("Categoria Sènior Masculi");
        } 
        else{
            System.out.println("Categoria Sènior Femeni");
        }
        else if (edat > 65 && sexe == 'M') {
            System.out.println("Categoria Veterà Masculi ");
        }
        else{
            System.out.println("Categoria Veterà Femeni");
        }
    }
}