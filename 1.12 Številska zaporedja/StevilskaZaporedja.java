import java.util.*;

public class StevilskaZaporedja {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prvoSt = sc.nextInt();
        int drugoSt = sc.nextInt();
        int korak = sc.nextInt();
        int sestevek = 0;

        if (korak == 0) {
            System.out.println("NAPAKA");
        } else if (prvoSt == drugoSt) {
            System.out.println(prvoSt);
        } else if(prvoSt < drugoSt && korak < 0) {
            System.out.println("NAPAKA");
        } else if (prvoSt > drugoSt && korak > 0) {
            System.out.println("NAPAKA");
        } else if (prvoSt <= drugoSt && korak > 0) {
            sestevek = prvoSt;

            while (sestevek <= drugoSt) {
                System.out.println(sestevek);
                sestevek += korak;
            }
        } else if (prvoSt > drugoSt && korak < 0) {
            sestevek = prvoSt;

            while (sestevek >= drugoSt) {
                System.out.println(sestevek);
                sestevek += korak;
            }
        }
    }
}
