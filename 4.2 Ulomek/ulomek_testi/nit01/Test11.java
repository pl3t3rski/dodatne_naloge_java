
public class Test11 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(-30, -40);
        Ulomek b = new Ulomek(24, -18);
        Ulomek c = new Ulomek(15, 20);

        System.out.println(a.toString());
        System.out.println(a.jeEnakKot(c));
        System.out.println(a.negacija().toString());
        System.out.println(a.obrat().toString());
        System.out.println(a.vsota(b).toString());
        System.out.println(a.razlika(b).toString());
        System.out.println(a.zmnozek(b).toString());
        System.out.println(a.kolicnik(b).toString());
        System.out.println(a.potenca(2).toString());
        System.out.println(b.potenca(-3).toString());
        System.out.println(a.jeManjsiOd(b));
    }
}
