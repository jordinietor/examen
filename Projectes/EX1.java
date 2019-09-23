import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        
        Scanner pantalla=new Scanner(System.in);

        String nom;
        String cognom;
        String domini;

        System.out.println("Introdueix el nom: ");
        nom=pantalla.nextLine();
        
        System.out.println("Introdueix el cognom: ");
        cognom=pantalla.nextLine();
        
        System.out.println("Introdueix el domini: ");
        domini=pantalla.nextLine();
        

        System.out.println("La teva direció de correu es: "+nom+"."+cognom+"@"+domini);



        pantalla.close();
    }
}