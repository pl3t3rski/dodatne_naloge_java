import java.util.Scanner;

public class predvolilniGolaz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int denar = sc.nextInt();

        while (denar > 0 && sc.hasNextInt()) {
            int cena1kosila = sc.nextInt();
            int stKosil = sc.nextInt();
            int vino = sc.nextInt();

            int kolkoPlaca = cenaPogostitve(cena1kosila, stKosil, vino);
            denar -= kolkoPlaca;

            if (denar >= 0) {
                System.out.println(kolkoPlaca + " " + denar);
            } else {
                System.out.println(kolkoPlaca + " -");
            }
            
        } 

    }

    public static int cenaPogostitve(int cenaNaKosilo, int kolkoFolkaJe, int aBoPijaca) {
        int koncnaCena = 0;

        if (aBoPijaca == 0) {
            koncnaCena = cenaNaKosilo * kolkoFolkaJe;

        } else { // tle pijejo tudi vino
            koncnaCena = cenaNaKosilo * kolkoFolkaJe;
            koncnaCena = koncnaCena + ((koncnaCena + 1) / 2);

        }
        return koncnaCena;
    }

}