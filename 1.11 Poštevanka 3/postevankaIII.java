import java.util.Scanner;

public class postevankaIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stA = sc.nextInt();
        int stB = sc.nextInt();

        for (int i = 1; stA * i <= stB; i++) {
            System.out.println(stA + " * " + i + " = " + (stA * i));

        }
        
    }
}
