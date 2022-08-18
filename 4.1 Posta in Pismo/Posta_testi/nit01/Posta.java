public class Posta {
    
    private String naziv;
    private int stevilka;

    public Posta(int stevilka, String naziv) {
        this.stevilka = stevilka;
        this.naziv = naziv;
    }

    public int vrniStevilko() {
        return this.stevilka;
    }
    
    public String vrniNaziv() {
        return this.naziv;
    }

    @Override
    public String toString() {
        return (this.stevilka + " " + this.naziv);
    }

}
