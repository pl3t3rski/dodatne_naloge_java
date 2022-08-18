import java.util.*;

public class absolutnaVrednost {
    
    public static void main (String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();

        if (stevilo >= 0) {
            System.out.println(stevilo);
        } else {
            stevilo = stevilo * (-1);
            System.out.println(stevilo);
        }

    }

}
