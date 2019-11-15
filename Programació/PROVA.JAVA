
        for (int i = 0; i < noms.length; i++) {
            System.out.println("Introdueix el nom J" + (i + 1) + ": ");
            noms[i][0] = scan.next();
        }
        System.out.println("\n");
        System.out.println("-------------------------------");

        for (int j = 0; j < noms.length; j++) {
            
            System.out.print(noms[j][0]);
        }
        System.out.println("-------------------------------");
        scan.close();