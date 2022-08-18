import java.util.Scanner;

public class CasovnaRazlikaDrugic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ure1 = sc.nextInt();
        int min1 = sc.nextInt();
        int ure2 = sc.nextInt();
        int min2 = sc.nextInt();

        int razlika = ((ure1 * 60) + min1) - ((ure2 * 60) + min2);

        int razlikaVUrah = razlika / 60;
        int razlikavMin = razlika - (razlikaVUrah * 60);

        if (razlikaVUrah < 0) {
            razlikaVUrah = razlikaVUrah * (-1);
        }

        if (razlikavMin < 0) {
            razlikavMin = razlikavMin * (-1);
        }

        // tole je rešitev brez printf-a 
        if (razlikavMin < 10) {
            System.out.println(razlikaVUrah + ":0" + razlikavMin);
        } else {
            System.out.println(razlikaVUrah + ":" + razlikavMin);
        } 
    }
}
