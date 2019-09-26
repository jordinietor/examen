public class EX4 {
    public static void main(String[] args) {

        String article;
        float preu;
        float descompte;
        float valor;

        System.out.println("Introdueix un article");
        article = System.console().readLine();

        System.out.println("Introdueix el preu");
        preu = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix el decompte");
        descompte = Float.parseFloat(System.console().readLine());

        valor = preu * descompte / 100;

        System.out.println("El preu final es: " + (preu - valor));

    }
}