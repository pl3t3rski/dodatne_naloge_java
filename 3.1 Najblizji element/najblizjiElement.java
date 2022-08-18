import java.util.Arrays;
import java.util.Scanner;

public class najblizjiElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zacSt = sc.nextInt();
        int velikostTabele = sc.nextInt();
        int[] tabela = new int[velikostTabele];

        int trenutnaRazlika = 0;
        int maxInt = 0;
        int maxRazlika = 10000;

        for (int i = 0; i <= velikostTabele-1; i++) {
            tabela[i] = sc.nextInt();
        }
        
        for (int j = 0; j <= velikostTabele-1; j++) {
            trenutnaRazlika = Math.abs(zacSt - tabela[j]);
            
            if (trenutnaRazlika < maxRazlika) {
                maxRazlika = trenutnaRazlika;
                maxInt = j;
            }

        }

        System.out.println(maxInt);

    }
}
