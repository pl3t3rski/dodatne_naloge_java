import java.util.Scanner;

public class potenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stA = sc.nextInt();
        int stB = sc.nextInt();
        int potenca = 1; // tle je fora da to daš da je enako 1 in ne 0, ker čene negre... 

        for (int i = 1; i <= stB; i++) {
            potenca = potenca * stA;

        }

        System.out.println(potenca);

    }
}