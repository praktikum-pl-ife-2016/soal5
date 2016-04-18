public class Ruang2D {
    
    private static double keliling,luas;
    private final static double phi = 3.14;

    
    public static double hitungLuasSegitiga(double a, double b) {
        luas = a*b/2;
        return luas;
 }
    public static double hitungKelilingSegitiga(double a, double b,double c) {
        keliling = a + b + c;
        return keliling;
 }
    public static double hitungLuasSegiempat(double a, double b) {
        luas = a*b;
        return luas;
 }
    public static double hitungKelilingSegiempat(double a, double b) {
        keliling = 2*(a+b);
        return keliling;
    }
    public static double hitungLuasLingkaran(double r) {
       luas = phi*r*r;
       return luas;
 }
    public static double hitungKelilingLingkaran(double r) {
       keliling = 2*phi*r;
       return keliling;
 }
    
}
    
