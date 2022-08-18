
public class Test06 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(a.zmnozek(b).toString());
        System.out.println(a.zmnozek(c).toString());
        System.out.println(a.zmnozek(d).toString());
        System.out.println(b.zmnozek(c).toString());
        System.out.println(b.zmnozek(d).toString());
        System.out.println(c.zmnozek(d).toString());
    }
}
