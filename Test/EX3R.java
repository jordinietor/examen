/**
 * EX3R
 */
public class EX3R {

    public static void main(String[] args) {
        int num;
        boolean primo=true;
        System.out.println("Entra un valor del 1 al 20: ");
        num = Integer.parseInt(System.console().readLine());
        for(int i=2; (num/i)>=i;i++){
            System.out.println("Intents: "+(i-1));
            if((num%i)==0){
                primo=false;
                break;
            }
        }
        if(primo)
            System.out.println("El numero es primer");
        else
            System.out.println("El numero no es primo");

             
            
    }
}


