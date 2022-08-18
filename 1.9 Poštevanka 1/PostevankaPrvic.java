import java.util.*;

public class PostevankaPrvic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prvoSt = sc.nextInt();
        int drugoSt = sc.nextInt();
        int zmnozek = 0;

        for (int i = 1; i <= drugoSt; i++) {
            zmnozek = prvoSt * i;
            System.out.println(zmnozek);
        }
    }
}
