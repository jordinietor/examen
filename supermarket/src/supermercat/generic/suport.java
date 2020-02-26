package supermercat.generic;

import java.time.LocalDate;
import java.time.Period;

public class suport {

    public static int calculaDies(LocalDate id) {
        Period p = Period.between(LocalDate.now(), id);
        int dies = p.getDays();
        System.out.println("Dies caduca" + dies);
        return p.getDays();
    }
}