import java.util.Scanner;

public class casovnaRazlika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ura1 = sc.nextInt();
        int min1 = sc.nextInt();
        int ura2 = sc.nextInt();
        int min2 = sc.nextInt();
        //preberemo vnose

        int ura1min = 0;
        int ura2min = 0;
        ura1min = ura1 * 60;
        ura2min = ura2 * 60;
        //spremenimo ure v minute

        int razlika = 0;
        razlika = (ura1min + min1) - (ura2min + min2);
        razlika = razlika * (-1);
        // tle nardimo matematični delček

        System.out.println(razlika);
           
    }
}