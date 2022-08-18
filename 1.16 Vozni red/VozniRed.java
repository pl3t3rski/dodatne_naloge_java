import java.util.*;

public class VozniRed {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int urePrvic = sc.nextInt();
        int minPrvic = sc.nextInt();
        int ureDrugic = sc.nextInt();
        int minDrugic = sc.nextInt();
        int casovniInterval = sc.nextInt();


        while (urePrvic * 60 + minPrvic <= ureDrugic * 60 + minDrugic) {

            // pretvorimo min v ure (tisto kar je čez 60)
            while (minPrvic >= 60) {
                urePrvic += 1;
                minPrvic -= 60;
            }

            System.out.printf("%02d:%02d%n", urePrvic, minPrvic);

            // na koncu dodamo minutam še časovni interval
            minPrvic += casovniInterval;

        }

    }   
}