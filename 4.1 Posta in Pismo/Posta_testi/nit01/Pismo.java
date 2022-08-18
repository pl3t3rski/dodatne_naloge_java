public class Pismo {
    
    private Posta izvornaPosta;
    private Posta ciljnaPosta;
    private boolean jePriporoceno;
    private int razdalja;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja) {
        this.izvornaPosta = izvorna;
        this.ciljnaPosta = ciljna;
        this.jePriporoceno = jePriporoceno;
        this.razdalja = razdalja;
    }

    @Override
    public String toString() {
        String priporocenost = (jePriporoceno ? "P" : "N");
        return (this.izvornaPosta + " -> " + this.ciljnaPosta + " (" + this.razdalja + " km) [" + priporocenost + "]");
    }

    public boolean izviraOd(Posta posta) {
        return izvornaPosta.equals(posta);
    }

   public boolean staIzvorInCiljIsta() {
        return izvornaPosta.equals(ciljnaPosta);
    }

    public boolean imaIstiCiljKot(Pismo pismo) {
        return this.ciljnaPosta.equals(pismo.ciljnaPosta);
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2) {
        return p1.ciljnaPosta.equals(p2.ciljnaPosta);
    }

    private static int r;
    private static int c;
    private static int p;

    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina) {
        r = enotaRazdalje;
        c = enotaCene;
        p = priporocnina;
    }

    public int cena() {
        int cena = 0; //probably bo treba vrnit neko ceno nazaj iz te metode

        if (jePriporoceno == true) {
            cena += p;
        }

        cena += (razdalja / r + 1) * c;

        return cena;
    }

    /*public int izracunajNavadnoCeno() {
        int navadnaCena = 0;

        if (razdalja <= (r - 1)) {
            navadnaCena = c;
        } else if (razdalja <= (2 * r - 1)) {
            navadnaCena = 2 * c;
        } else if (razdalja <= (3 * r - 1)) {
            navadnaCena = 3 * c;
        }

        return navadnaCena;
    }*/

    public boolean jeDrazjeOd(Pismo pismo) {

        return (this.cena() > pismo.cena());
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2) {

        if (p1.cena() > p2.cena()) {
            return p1;
        } else if (p1.cena() < p2.cena()) {
            return p2;
        } else if (p1.cena() == p2.cena()) {
            return p2;
        }

        return null;
    }

    public Pismo izdelajPovratno() {
        Pismo povratnoPismo = new Pismo(ciljnaPosta, izvornaPosta, jePriporoceno, razdalja);
        return povratnoPismo;
    }
}

