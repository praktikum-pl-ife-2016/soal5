

public class Ruang2D {

    final static double phi = 3.14;

    public static int KelilingSegitiga(int sisiA, int sisiB, int sisiC) {
        return (sisiA + sisiB + sisiC);
    }

    public static double luasSegitiga(int alas, int tinggi) {
        return (alas * tinggi * 0.5);
    }

    public static int kelilingSegiempat(int panjang, int lebar) {
        return (panjang * lebar);
    }

    public static int luasSegiempat(int panjang, int lebar) {
        return (2 * (panjang + lebar));
    }

    public static double kelilingLingkarang(int r) {
        return (phi * r * r);
    }

    public static double luasLingkaran(int d) {
        return(phi * d);
    }
}
