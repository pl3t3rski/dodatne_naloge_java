import java.util.Scanner;

import java.util.Arrays;

public class UrejanjeTrojice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabelaTreh = new int[3];

        for (int i = 0; i < tabelaTreh.length; i++) {
            tabelaTreh[i] = sc.nextInt();
        }

        Arrays.sort(tabelaTreh);

        for (int i = 0; i < tabelaTreh.length -1; i++) {
            System.out.print(tabelaTreh[i] + " ");
        }

        System.out.println(tabelaTreh[tabelaTreh.length - 1]);

    }
}