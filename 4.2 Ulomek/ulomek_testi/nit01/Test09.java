
public class Test09 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(new Ulomek(-1, 1).vsota(a).razlika(b).zmnozek(c).kolicnik(d).potenca(-2).toString());
    }
}
