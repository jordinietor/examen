public class EX2 {
    public static void main(String[] args) {
        float pes;
        float altura;
        float IMC;

        System.out.println("Introdueix el teu pes: ");
        pes = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix el teu altura: ");
        altura = Float.parseFloat(System.console().readLine());

        IMC = pes / (altura * 2);
        System.out.println(IMC);
        if (IMC < 18.5) {
            System.out.println("El teu valor de IMC es de: " + IMC + "  Estas molt prim/a");
        } else if (IMC < 25) {
            System.out.println("El teu valor de IMC es de: " + IMC + "  Estas bé");
        } else if (IMC < 30) {
            System.out.println("El teu valor de IMC es de: " + IMC + "  Sobrepes");
        } else {
            System.out.println("El teu valor de IMC es de: " + IMC + "  Obesitat");
        }
    }
}