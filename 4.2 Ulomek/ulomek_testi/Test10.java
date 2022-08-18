
public class Test10 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(a.jeManjsiOd(a));
        System.out.println(a.jeManjsiOd(b));
        System.out.println(a.jeManjsiOd(c));
        System.out.println(a.jeManjsiOd(d));

        System.out.println(b.jeManjsiOd(a));
        System.out.println(b.jeManjsiOd(b));
        System.out.println(b.jeManjsiOd(c));
        System.out.println(b.jeManjsiOd(d));

        System.out.println(c.jeManjsiOd(a));
        System.out.println(c.jeManjsiOd(b));
        System.out.println(c.jeManjsiOd(c));
        System.out.println(c.jeManjsiOd(d));
    }
}
