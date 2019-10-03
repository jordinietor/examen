/**
 * EX7R
 */
public class EX7R {

    public static void main(String[] args) {
        int dies, mdies, mes, any;

        System.out.println("quants dies has viscut (sisplau conta els mesos com a 30)");
        dies = Integer.parseInt(System.console().readLine());

        any = (int)dies/365;
        mes = (int)((dies-(any*365))/30);
        mdies = dies-(any*365)-(mes*30);

        System.out.println("has viscut " + any + " anys " + mes + " mesos " + mdies + " dies");
    }
}
    
