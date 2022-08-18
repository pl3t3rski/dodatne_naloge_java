
public class Test07 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(a.kolicnik(b).toString());
        System.out.println(a.kolicnik(c).toString());
        System.out.println(a.kolicnik(d).toString());
        System.out.println(b.kolicnik(c).toString());
        System.out.println(b.kolicnik(d).toString());
        System.out.println(c.kolicnik(d).toString());
    }
}
