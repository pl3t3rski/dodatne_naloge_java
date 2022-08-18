import java.util.*;

public class digitalneCrtice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int velikostTabele = sc.nextInt();
        int[] tabela = new int[velikostTabele];
        int[] crtice = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int stCrtic = 0;
        int maxCrtic = 0;
        int indexZmagEl = 0;

        // zapišemo vse elemente v tabelo
        for (int i = 0; i < velikostTabele; i++) {
            tabela[i] = sc.nextInt();
        }

        // se sprehodimo cez tabelo
        for (int i = 0; i < velikostTabele; i++) {
            //za vsako število pogledamo števko in jo glede na tabelo crtice pristejemo h <stCrtic>
            stCrtic = 0;
            
            //tale loop mamo dokler je naše število večje od 0, ker
            //npr. 5 % 10 == 0
            // + moremo naredit kopijo števila, ker čene bojo vse vrednosti v tabeli na koncu 0
            int kopijaTrenutnegaSt = 0;
            kopijaTrenutnegaSt = tabela[i];

            while (kopijaTrenutnegaSt > 0) {
                stCrtic += crtice[kopijaTrenutnegaSt % 10];
                kopijaTrenutnegaSt = kopijaTrenutnegaSt / 10;
            }

            //tukej preverimo če je št črtic trenutnega števila v tabeli večje od <mxCrtic>
            //če je, posodobimo maxCrtic in index zmagovalnega elementa
            if (stCrtic > maxCrtic){
                maxCrtic = stCrtic;
                indexZmagEl = i;
            }
        }

        System.out.println(tabela[indexZmagEl]);


    }
    
}
