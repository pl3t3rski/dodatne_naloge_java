
public class Test11 {

    public static void main(String[] args) {
        Posta lj = new Posta(1000, "Ljubljana");
        Posta mb = new Posta(2000, "Maribor");
        Posta ce = new Posta(3000, "Celje");
        System.out.println(lj.vrniNaziv());
        System.out.println(mb.vrniStevilko());
        System.out.println(ce.toString());

        Pismo.nastaviKonstanteZaCeno(10, 3, 20);
        Pismo lj2ce = new Pismo(lj, ce, true, 75);
        Pismo mb2lj = new Pismo(mb, lj, false, 130);
        Pismo ce2ce = new Pismo(ce, ce, true, 0);
        System.out.println(lj2ce.izviraOd(mb));
        System.out.println(ce2ce.staIzvorInCiljIsta());
        System.out.println(lj2ce.imaIstiCiljKot(ce2ce));
        System.out.println(Pismo.imataIstiCilj(lj2ce, mb2lj));
        System.out.println(lj2ce.cena());
        System.out.println(mb2lj.cena());
        System.out.println(mb2lj.jeDrazjeOd(lj2ce));
        System.out.println(Pismo.vrniDrazje(mb2lj, lj2ce).toString());
        System.out.println(mb2lj.izdelajPovratno().toString());
    }
}
