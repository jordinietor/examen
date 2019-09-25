public class EX1 {
    public static void main(String[] args) {

        String nom;
        String cognom;
        String domini;

        System.out.println("Introdueix el nom: ");
        nom=System.console().readLine();
        
        System.out.println("Introdueix el cognom: ");
        cognom=System.console().readLine();
        
        System.out.println("Introdueix el domini: ");
        domini=System.console().readLine();
        

        System.out.println("La teva direció de correu es: "+nom+"."+cognom+"@"+domini);



    }
}