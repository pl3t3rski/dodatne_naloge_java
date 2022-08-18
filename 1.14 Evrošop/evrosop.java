import java.util.Scanner;

public class evrosop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int blagajna = 0;
        int trenutni = 0;
        int stKovancevPo2 = 0;
        boolean bankrot = false;

        while (sc.hasNextInt()) {
            trenutni = sc.nextInt();

            if (trenutni == 1) {
                blagajna += trenutni;

            } else if (trenutni == 2) {
                blagajna = blagajna - 1;
                stKovancevPo2++;
            }

            if (blagajna < 0) {
                bankrot = true;
            }
        }
        
        if (bankrot == true) {
            System.out.println("BANKROT");

        } else if (bankrot == false) {
            System.out.println(blagajna);
            System.out.println(stKovancevPo2);

        }

    }
}