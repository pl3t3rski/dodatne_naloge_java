import java.util.*;

public class VrazeverniBoris {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        int stDni = sc.nextInt();
        int met = 0;
        String kateriDan = "D";

        Random rand = new Random(seme);

        for (int i = 1; i <= stDni; i++) {

            // vsak "dan" moremo resetirat stVsehMetov in stLihihMetov
            int stLihihMetov = 0;
            int stVsehMetov = 0;

            // preverimo če je nedelja
            if (i % 7 != 0) {
                kateriDan = "D";
            } else {
                kateriDan = "N";
            }

            System.out.printf("%4d (%s): ", i, kateriDan);

            // grdo zgleda, se ponavlja, ampak deluje
            if (kateriDan.equals("D")) {
                while (stLihihMetov < 3) {
                    // met kocke generiramo s pomocjo math.random
                    // rand.nextInt(meja) + zamik
                    met = (rand.nextInt(6) + 1);
                    System.out.print(met + " ");
                    stVsehMetov++;

                    if (met % 2 != 0) {
                        stLihihMetov++;
                    }
                }
                // na koncu naprintamo še število vseh metov in dodamo prelom vrstice
                System.out.println("[" + stVsehMetov + "]");

            } else if (kateriDan.equals("N")) {
                while (stLihihMetov < 5) {

                    met = (rand.nextInt(6) + 1);
                    System.out.print(met + " ");
                    stVsehMetov++;

                    if (met % 2 != 0) {
                        stLihihMetov++;
                    }
                }
                System.out.println("[" + stVsehMetov + "]");

            }



        }
    }
}