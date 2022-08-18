
public class Test04 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(a.vsota(b).toString());
        System.out.println(a.vsota(c).toString());
        System.out.println(a.vsota(d).toString());
        System.out.println(b.vsota(c).toString());
        System.out.println(b.vsota(d).toString());
        System.out.println(c.vsota(d).toString());
    }
}
