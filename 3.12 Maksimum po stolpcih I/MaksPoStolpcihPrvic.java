import java.util.*;

public class MaksPoStolpcihPrvic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stVrstic = sc.nextInt();
        int stStolpcev = sc.nextInt();

        int[][] tabela = new int[stVrstic][stStolpcev];
        int[] tabelaMaks = new int[stStolpcev];

        // vpišemo vse elemente v 2D tabelo (ki ubistvu ni 2D tabela -> 1D tabela kazalcev na druge tabele)
        for (int i = 0; i < stVrstic; i++) {
            for (int j = 0; j < stStolpcev; j++) {
                tabela[i][j] = sc.nextInt();
            } 
        }

        // se sprehodimo čez stolpec in potem zapišemo v tabelo <tabelaMaks> maksimalen element
        for (int j = 0; j < stStolpcev; j++) {

            // vsak krog moremo resetirat <maksSt>
            int maksSt = -100000;

            // gremo čez vrstice na stolpcu <j>
            for (int i = 0; i < stVrstic; i++) {
                int trenutnoSt = tabela[i][j];
                if (trenutnoSt > maksSt) {
                    maksSt = trenutnoSt;
                }
            }

            //vpišemo v tabelo <tabelaMaks> maksimum, ki smo ga dobili
            tabelaMaks[j] = maksSt;

        }

        /*for (int i = 0; i < stVrstic; i++) {
            for (int j = 0; j < stStolpcev; j++) {
                System.out.println(tabela[i][j]);
            } 
        } */

        System.out.println(Arrays.toString(tabelaMaks));


    }
}
