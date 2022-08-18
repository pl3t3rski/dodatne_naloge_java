
public class Test05 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        System.out.println(a.razlika(b).toString());
        System.out.println(a.razlika(c).toString());
        System.out.println(a.razlika(d).toString());
        System.out.println(b.razlika(c).toString());
        System.out.println(b.razlika(d).toString());
        System.out.println(c.razlika(d).toString());
    }
}
