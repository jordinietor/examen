package app;

import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        int error = 8;

        System.out.println("----------");
        System.out.print("|");
        if (error > 0) {
            System.out.print("    |    ");
        }
        System.out.println();

        System.out.print("|");
        if (error > 1) {
            System.out.print("    O    ");
        }
        System.out.println();

        System.out.print("|");
        if (error > 2) {
            System.out.print("   /");
        }
        if (error > 3) {
            System.out.print("|");
        }
        if (error > 4) {
            System.out.print("\\    ");
        }
        System.out.println();
        
        System.out.print("|");
        if (error > 5) {
            System.out.print("    |    ");
        }
        System.out.println();
        
        System.out.print("|");
        if (error > 6) {
            System.out.print("   /");
        }
        if (error > 7) {
            System.out.print(" \\    ");
        }
        System.out.println();
        
        System.out.print("|");
    }
}