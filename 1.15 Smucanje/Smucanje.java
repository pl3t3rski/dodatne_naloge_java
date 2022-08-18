import java.util.*;

public class Smucanje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stTekmovalcev = sc.nextInt();
        int minSestevek = 10000000;
        int najTekmovalec = 0;
        int tekmovalec = 0;
        boolean niNobenega = true;

        for (int i = 1; i <= stTekmovalcev; i++) {
            int prviRez = 0;
            int drugiRez = 0;
            int sestevek = 0;

            prviRez += sc.nextInt();
            // če je prva enako 0, potem skočimo na naslednjega igralca
            if (prviRez == 0) {
                tekmovalec++;
                //System.out.println("diskvalificiran -> " + tekmovalec);
                continue;
            }

            drugiRez += sc.nextInt();
            // enako za drugega
            if (drugiRez == 0) {
                tekmovalec++;
                //System.out.println("diskvalificiran -> " + tekmovalec);
                continue;
            }
            sestevek = prviRez + drugiRez;
            tekmovalec++;
            //System.out.println(tekmovalec);

            if (sestevek < minSestevek) {
                minSestevek = sestevek;
                najTekmovalec = tekmovalec;
                niNobenega = false;
            }


        }

        if (niNobenega) {
            System.out.println("NIHCE");
        } else {
            System.out.println(najTekmovalec);
            System.out.println(minSestevek);
        }
    }
}