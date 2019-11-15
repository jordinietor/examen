package app;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        char taulell[] = new char[9];
        Random r = new Random();
        int num, cv = 0, cc = 0;

        for (int i = 0; i < taulell.length; i++) {
            num = r.nextInt(2);
            System.out.println(num);
            if (num == 0) {
                cc++;
            } else {
                cv++;
            }
        }
        System.out.println(taulell);
        System.out.println("Contador Consonats: " + cc);
        System.out.println("Contador Vocals: " + cv);
    }
}