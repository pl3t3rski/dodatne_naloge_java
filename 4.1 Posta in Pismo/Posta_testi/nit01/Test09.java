
public class Test09 {

    public static void main(String[] args) {
        Posta lj = new Posta(1000, "Ljubljana");
        Posta mb = new Posta(2000, "Maribor");
        Posta ce = new Posta(3000, "Celje");

        Pismo lj2mb = new Pismo(lj, mb, true, 130);
        Pismo lj2ce = new Pismo(lj, ce, false, 75);
        Pismo ce2mb = new Pismo(ce, mb, true, 60);
        Pismo mb2mb = new Pismo(mb, mb, true, 0);

        Pismo.nastaviKonstanteZaCeno(5, 20, 10);
        System.out.println( Pismo.vrniDrazje(lj2mb, lj2ce).toString() );
        System.out.println( Pismo.vrniDrazje(lj2mb, ce2mb).toString() );
        System.out.println( Pismo.vrniDrazje(lj2mb, mb2mb).toString() );
        System.out.println( Pismo.vrniDrazje(lj2ce, ce2mb).toString() );
        System.out.println( Pismo.vrniDrazje(lj2ce, mb2mb).toString() );
        System.out.println( Pismo.vrniDrazje(ce2mb, mb2mb).toString() );
    }
}
