public class Ruang2D {
    static final double phi = 3.14;
    public static void hitungKelilingSegitiga(double a) {
        double ksegitiga = a + a + a;
        System.out.println("Keliling segitiga = "+ ksegitiga);
    }
    public static void hitungLuasSegitiga(double a, double b) {
        double lsegitiga = 0.5 * a * b;
        System.out.println("Luas segitiga = "+ lsegitiga);
    }
    public static void hitungLuasSegiempat(double a, double b) {
        double lsegiempat = a * b;
        System.out.println("Luas segiempat = "+ lsegiempat);
    }
    public static void hitungKelilingSegiempat(double a, double b) {
        double ksegiempat = 2*(a+b);
        System.out.println("Keliling segiempat = "+ ksegiempat);
    }
    public static void hitungKelilingLingkaran(double r) {
        double klingkaran = 2*phi*r;
        System.out.println("Keliling lingkaran = "+ klingkaran);
    }
    public static void hitungLuasLingkaran(double r) {
        double llingkaran = phi*r*r;
        System.out.println("Luas lingkaran = "+ llingkaran);
    }  
}
