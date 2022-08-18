
public class Test02 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(a.negacija().toString());
        System.out.println(b.negacija().toString());
        System.out.println(c.negacija().toString());
        System.out.println(d.negacija().toString());
    }
}
