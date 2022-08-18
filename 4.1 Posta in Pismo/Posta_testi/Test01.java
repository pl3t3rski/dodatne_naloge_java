
public class Test01 {

    public static void main(String[] args) {
        Posta lj = new Posta(1000, "Ljubljana");
        Posta mb = new Posta(2000, "Maribor");
        Posta ce = new Posta(3000, "Celje");

        System.out.println(lj.vrniStevilko());
        System.out.println(mb.vrniNaziv());
        System.out.println(ce.toString());
    }
}
