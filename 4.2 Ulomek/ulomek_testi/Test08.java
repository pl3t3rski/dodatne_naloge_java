
public class Test08 {

    public static void main(String[] args) {
        Ulomek a = new Ulomek(2, 3);
        Ulomek b = new Ulomek(288, 216);
        Ulomek c = new Ulomek(14, -2);
        Ulomek d = new Ulomek(-12, -150);

        for (int i = -3;  i <= 3;  i++) {
            System.out.println(a.potenca(i).toString());
            System.out.println(b.potenca(i).toString());
            System.out.println(c.potenca(i).toString());
            System.out.println(d.potenca(i).toString());
        }
    }
}
