package ruang2d;

public class Ruang2D {

    public static final double phi = 3.14;

    public static double hitungSegitigaLuas(double a, double b) {
        return a * b / 2;
    }

    public static double hitungSegitigaKel(double a) {
        return 3 * a;
    }

    public static int hitungSegiempatLuas(int a, int b) {
        return a * b;

    }

    public static int hitungSegiempatKel(int a, int b) {
        return 2 * (a + b);
    }

    public static double hitungLingkaranLuas(double a) {
        return phi * Math.pow(a, 2);
    }

    public static double hitungLingkaranKel(double a) {
        return 2 * phi * a;
    }
}
