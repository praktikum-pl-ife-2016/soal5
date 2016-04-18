package ruang2d;

public class Ruang2D {

    static final double phi = 3.14;
    
    public static double luasSegitiga(int a, int b) {
        int nilai;
        return nilai = a * b /2;
    }
    
    public static int luasSegiempat(int a, int b) {
        int nilai;
        return nilai = a * b;
    }
    
    public static double luasLingkaran(int a) {
        double nilai;
        return nilai = (int) (phi * a * a);
    }
    
    public static int kelilingSegitiga(int a, int b, int c) {
        int nilai;
        return nilai = a + b + c;
    }
    
    public static int kelilingSegiempat(int a) {
        int nilai;
        return nilai = a * 4;
    }

    public static double kelilingLingkaran(int a) {
        double nilai;
        return nilai = 2 * phi * a;
    }
}