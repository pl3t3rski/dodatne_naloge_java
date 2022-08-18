import java.util.Arrays;
import java.util.Scanner;

public class medianaTrojice {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tabela = new int[3];
        
        for (int i = 0; i <= 2; i++) {
            tabela[i] = sc.nextInt();
        }

        Arrays.sort(tabela);
        
        System.out.println(tabela[1]);
        
    }
}
