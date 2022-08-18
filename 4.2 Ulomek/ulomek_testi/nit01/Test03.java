
public class Test03 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(a.obrat().toString());
        System.out.println(b.obrat().toString());
        System.out.println(c.obrat().toString());
        System.out.println(d.obrat().toString());
    }
}
