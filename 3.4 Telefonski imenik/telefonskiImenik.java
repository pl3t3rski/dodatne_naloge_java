import java.util.*;

public class telefonskiImenik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stPrvihImen = sc.nextInt();
        String[] prvaImena = new String[stPrvihImen];
        String[] televonskeSt = new String[stPrvihImen];

        // naredimo dve tabeli, ki imasta na enakih indeksih imena in telefonske
        for (int i = 0; i < stPrvihImen; i++) {
            prvaImena[i] = sc.next();
            televonskeSt[i] = sc.next();
        }


        int stDrugihImen = sc.nextInt();
        String[] drugaImena = new String[stDrugihImen];

        // naredimo drugo tabelo z drugimi imeni
        for (int j = 0; j < stDrugihImen; j++) {
            drugaImena[j] = sc.next();
        }

        // obrnemo obedve tabeli, da printamo potem drugega po vrsti in ne prvega
        Collections.reverse(Arrays.asList(prvaImena));
        Collections.reverse(Arrays.asList(televonskeSt));

        // moremo se sprehodit skozi tabelo <drugaImena>
        // potem za vsako ime preverimo če se sklada z kakšnim imenom v tabeli <prvaImena>
        // če se sklada izpišemo tabelo <telefonskeSt> na tem indeksu
        // če pridemo skozi celotno tabelo in ne najdemo 

        for (int j = 0; j < stDrugihImen; j++) {

            boolean imamoStevilko = false;

            for (int i = 0; i < stPrvihImen; i++) {

                // preverimo če je ime v drugaTabela na indeksu <j> enako imenu na indeksu
                // <i> v prvaTabela. Če je true izpišemo telefonsko, čene preverjamo naprej
                // če preverimo celo tabelo in ni nobenega imena, potem številke nimamo in 
                // printamo "NEZNANA"
                if (drugaImena[j].equals(prvaImena[i])) {
                    System.out.println(televonskeSt[i]);
                    imamoStevilko = true;
                    break;
                }

            }

            if (imamoStevilko == false) {
                System.out.println("NEZNANA");
            }
        }

    }
}