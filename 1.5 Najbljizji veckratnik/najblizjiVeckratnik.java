import java.util.*;

public class najblizjiVeckratnik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int veckratnikiOd = sc.nextInt();
        int okoliSt = sc.nextInt();
        int iskanoSt = 0;

        double deljenjeDouble = (double) okoliSt / veckratnikiOd;
        int deljenjeInt = okoliSt / veckratnikiOd;
        double polovicka = 0.5 + (double) deljenjeInt;

        if (deljenjeDouble <= polovicka) {
            iskanoSt = deljenjeInt * veckratnikiOd;
        } else if (deljenjeDouble > polovicka) {
            iskanoSt = (deljenjeInt + 1) * veckratnikiOd;
        }

        System.out.println(iskanoSt);

    }
}