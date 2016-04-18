package ruang2d;
import java.util.Scanner;

public class mainRuang2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan nilai alas : ");
        int a = in.nextInt();
        System.out.println("masukkan nilai tinggi :");
        int b = in.nextInt();
        System.out.println("masukkan nilai sisi miring : ");
        int c = in.nextInt();
        Ruang2D.luasSegitiga(a, b, c);

        System.out.println("masukkan nilai sisi1 : ");
        int sisi1 = in.nextInt();
        System.out.println("masukkan nilai sisi2 : ");
        int sisi2 = in.nextInt();
        Ruang2D.luasSegiempat(sisi1, sisi2);

        System.out.println("masukkan nilai r :");
        double r = in.nextDouble();
        final double phi = 3.14;

        Ruang2D.luasLingkaran(r);

    }
}
