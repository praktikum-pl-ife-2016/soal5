
public class Ruang2D {

    private static final double phi = 3.14;

    public static double luasSegitiga(int a, int b) {
        double hasil;
        return hasil = a * b / 2;

    }

    public static double luasSegiempat(int a) {
        double hasil;
        return hasil = a * a;

    }

    public static double luasLingkaran(int a) {
        double hasil;
        return hasil = (phi * a * a);

    }

    public static int kelilingSegitiga(int a, int b, int c) {
        int hasil;
        return hasil = a + b + c;
    }

    public static int kelilingSegiempat(int a) {
        int hasil;
        return hasil = 4*a;
    }

    public static double kelilingLingkaran(int a) {
        double hasil;
        return hasil = 2 * phi * a;
    }

}
