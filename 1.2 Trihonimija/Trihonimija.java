import java.util.*;

public class Trihonimija {
    
    public static void main(String[] args) {
        // Scanner ni nujno da se kliče <sc> :)
        Scanner Joze = new Scanner(System.in);

        int prvoStevilo = Joze.nextInt();
        int drugoStevilo = Joze.nextInt();

        if (prvoStevilo > drugoStevilo) {
            System.out.println("1");
        } else if (prvoStevilo == drugoStevilo) {
            System.out.println("0");
        } else if (prvoStevilo < drugoStevilo) {
            System.out.println("-1");
        } 
    }
}
