import java.util.*;

public class Ulomek {

    private int a;
    private int b;
    
    public Ulomek(int a, int b) {
        // tukej dodam <nsd> (op. najvecji skupni delitelj) ker nočem da pri vsakem
        // pogoju to računamo
        int nsd = gcd(a, b);
        
        a = a / nsd;
        b = b / nsd;

        // uredimo predznake 
        if (b < 0 && a > 0) {
            b = b * (-1);
            a = a * (-1);
        } else if (a < 0 && b < 0) {
            b = b * (-1);
            a = a * (-1);
        }

        this.a = a;
        this.b = b;
        
    } 

    // tole nam zračuna največji skupni delitelj (ang. Greatest common divider)
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    @Override
    public String toString() {
        return (a + "/" + b);
    }

    public boolean jeEnakKot(Ulomek u) {
        // tle damo to String ker čene recimo -30/-40 in 15/20 obravnava kot različna ulomka
        return this.toString().equals(u.toString());
    }

    public Ulomek negacija() {
        return new Ulomek(-a, b);
    }

    public Ulomek obrat() {
        return new Ulomek(b, a);
    }

    public Ulomek vsota(Ulomek u) {
        // izračunamo najmanjši skupni večkratni 
        int lcm = Math.abs(b * u.b) / gcd(b, u.b);
        return new Ulomek(a*(lcm/b) + u.a*(lcm/u.b), lcm);
    }

    public Ulomek razlika(Ulomek u) {
        int lcm = Math.abs(b * u.b) / gcd(b, u.b);
        return new Ulomek(a*(lcm/b) - u.a*(lcm/u.b), lcm);
    }

    public Ulomek zmnozek(Ulomek u) {
        int stevec = this.a * u.a;
        int imenovalec = this.b * u.b;

        return new Ulomek(stevec, imenovalec);
    }

    public Ulomek kolicnik(Ulomek u) {
        int stevec = this.a * u.b;
        int imenovalec = this.b * u.a;

        return new Ulomek(stevec, imenovalec);
    }

    public Ulomek potenca(int eksponent) {
        int i = (eksponent < 0) ? -eksponent : eksponent;

        if (eksponent < 0) {
            return new Ulomek((int) Math.pow(b, i), (int) Math.pow(a, i));
        } else{
            return new Ulomek((int) Math.pow(a, i), (int) Math.pow(b, i));
        } 
    }

    public boolean jeManjsiOd(Ulomek u) {
        float prvi = a / b;
        float drugi = u.a / u.b;

        if (prvi < drugi) {
            return true;
        } else {
            return false;
        }
    }


    
}