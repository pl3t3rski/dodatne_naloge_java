import java.util.Scanner;
import java.util.Arrays;

public class zlataSredina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int velikostTabele = 2 * k + 1;
        int[] tabela = new int[velikostTabele];

        for (int i = 0; i < velikostTabele; i++) {
            tabela[i] = sc.nextInt();
        }

        // indeks iskanega je kar <k> ker če imamo recimo k = 5, potem bo tabela velika
        // 11 enot, indeks iskanega elementa pa bo šesti po vrsti, torej na indeksu 5 (ker začnemo štet indekse z 0)
        int indeksIskanega = k;

        Arrays.sort(tabela);
        /*
        //urejanje tabele
        for (int i = 1; i < tabela.length; i++) {
            // vstavi element t[i] v podtabelo t[0..i-1]
            int element = tabela[i];
            int j = i - 1;
            while (j >= 0 && tabela[j] > element) {
            tabela[j + 1] = tabela[j];
            j--;
            }
            tabela[j + 1] = element;
        }
        */

        //System.out.println(Arrays.toString(tabela));
        System.out.println(tabela[indeksIskanega]);

        }
    }

